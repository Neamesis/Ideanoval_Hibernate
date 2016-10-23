package com.humanbooster.ideanoval.dao;

import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.models.User;
import org.hibernate.Session;

/**
 * Created by Nea on 23/10/2016.
 */
public interface IdeaDao {
    public void addIdea(Idea idea);

    public void deleteUIdea(Idea idea);

    public Session openCurrentSessionWithTransaction();

    public void closeCurrentSessionwithTransaction();
}
