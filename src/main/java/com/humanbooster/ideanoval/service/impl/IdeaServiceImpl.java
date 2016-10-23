package com.humanbooster.ideanoval.service.impl;

import com.humanbooster.ideanoval.dao.IdeaDao;
import com.humanbooster.ideanoval.dao.impl.IdeaDaoImpl;
import com.humanbooster.ideanoval.models.CategoryIdea;
import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.models.User;
import com.humanbooster.ideanoval.service.IdeaService;

import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public class IdeaServiceImpl  implements IdeaService {

    private IdeaDao id = new IdeaDaoImpl();

    @Override
    public void addIdea(String title, String descrption, CategoryIdea category, User user) {
        Idea idea = new Idea(title, descrption, category, user);
        id.openCurrentSessionWithTransaction();
        id.addIdea(idea);
        id.closeCurrentSessionwithTransaction();
    }

    @Override
    public void deleteIdea(Idea idea) {

    }

    @Override
    public List<Idea> getAllIdeas() {
        id.openCurrentSessionWithTransaction();
        List<Idea> ideas = id.findAll();
        id.closeCurrentSessionwithTransaction();
        return ideas;
    }
}
