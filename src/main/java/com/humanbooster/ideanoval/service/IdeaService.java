package com.humanbooster.ideanoval.service;

import com.humanbooster.ideanoval.models.CategoryIdea;
import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.models.User;

import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public interface IdeaService {

    public void addIdea(String ideaTitle, String ideaDescription, User user);

    public void addIdea(String title, String descrption, CategoryIdea category, User user);

    public void deleteIdea(Idea idea);

    public List<Idea> getAllIdeas();


}
