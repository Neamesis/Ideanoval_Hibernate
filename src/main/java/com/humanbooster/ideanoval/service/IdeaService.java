package com.humanbooster.ideanoval.service;

import com.humanbooster.ideanoval.models.Idea;

import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
public interface IdeaService {

    public List<Idea> getAllIdeas();

    public List<Idea> getAllUserSIdeas();

}
