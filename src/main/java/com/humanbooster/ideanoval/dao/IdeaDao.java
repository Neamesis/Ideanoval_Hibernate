package com.humanbooster.ideanoval.dao;

import com.humanbooster.ideanoval.models.Idea;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public interface IdeaDao {
    public boolean addIdea(Idea idea);

    public void deleteIdea(Idea idea);

    public List<Idea> findAll();

    public Session openCurrentSessionWithTransaction();

    public void closeCurrentSessionwithTransaction();
}
