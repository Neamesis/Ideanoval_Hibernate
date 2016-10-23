package com.humanbooster.ideanoval.dao.impl;

import com.humanbooster.ideanoval.dao.IdeaDao;
import com.humanbooster.ideanoval.models.Idea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public class IdeaDaoImpl implements IdeaDao{

    private Session session;
    private Transaction transaction;

    @Override
    public boolean addIdea(Idea idea) {
        if (session.save(idea) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void deleteIdea (Idea idea) {

    }

    @Override
    public List<Idea> findAll() {
        List<Idea> allIdeas = session.createQuery("FROM Idea").getResultList();
        return allIdeas;
    }

    /**
     *
     * Hibernate Session et Transaction
     *
     */
    public Session openCurrentSession() {
        session = getSessionFactory().openSession();
        return session;

    }


    @Override
    public Session openCurrentSessionWithTransaction() {
        session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        return session;
    }

    public void closeCurrentSession() {
        session.close();
    }

    @Override
    public void closeCurrentSessionwithTransaction() {
        transaction.commit();
        session.close();

    }

    private static SessionFactory getSessionFactory() {

        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        return sessionFactory;

    }

    public Session getCurrentSession() {
        return session;
    }

    public void setCurrentSession(Session currentSession) {
        this.session = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return transaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.transaction = currentTransaction;
    }
}
