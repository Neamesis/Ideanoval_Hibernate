package com.humanbooster.ideanoval.dao.impl;

        import com.humanbooster.ideanoval.dao.UserDao;
        import com.humanbooster.ideanoval.models.User;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.Transaction;
        import org.hibernate.boot.Metadata;
        import org.hibernate.boot.MetadataSources;
        import org.hibernate.boot.registry.StandardServiceRegistry;
        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
        import org.hibernate.query.Query;

        import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public class UserDaoImpl implements UserDao{

    private Session session;
    private Transaction transaction;

    @Override
    public boolean addUser(User user) {
        if (session.save(user) != null) {
            return true;
        }
        return false;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        User userToFind = null;
        String hql = "FROM User WHERE email=:email AND password=:password";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        query.setParameter("password", password);

        List usersFound = query.getResultList();
        if (usersFound.size() == 1) {
            userToFind = (User) usersFound.get(0);
        } else {
            System.out.println("Identifiants non valides.");
        }
        return userToFind;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

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

    @Override
    public User findUserById(int id) {
        User user = session.byId(User.class).load(id);
        return user;
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
