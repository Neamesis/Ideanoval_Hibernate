package com.humanbooster.ideanoval.service;

import com.humanbooster.ideanoval.models.CategoryIdea;

import java.util.List;

/**
 * Created by Nea on 25/10/2016.
 */
public interface CategoryService {

    public void addCategory(String label, String description);

    public CategoryIdea findCategoryById(String id);

    public List<CategoryIdea> getAllCategories();
}
