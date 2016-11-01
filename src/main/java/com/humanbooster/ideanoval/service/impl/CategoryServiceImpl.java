package com.humanbooster.ideanoval.service.impl;

import com.humanbooster.ideanoval.dao.CategoryDao;
import com.humanbooster.ideanoval.dao.impl.CategoryDaoImpl;
import com.humanbooster.ideanoval.models.CategoryIdea;
import com.humanbooster.ideanoval.service.CategoryService;

import java.util.List;

/**
 * Created by Nea on 25/10/2016.
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao cd = new CategoryDaoImpl();


    @Override
    public void addCategory(String label, String description) {
        CategoryIdea categoryIdea = new CategoryIdea(label, description);
        cd.openCurrentSessionWithTransaction();
        cd.addCategory(categoryIdea);
        cd.closeCurrentSessionwithTransaction();
    }

    @Override
    public CategoryIdea findCategoryById(String id) {
        cd.openCurrentSessionWithTransaction();
        CategoryIdea category = cd.findCategoryById(id);
        cd.closeCurrentSessionwithTransaction();
        return category;
    }

    @Override
    public List<CategoryIdea> getAllCategories() {
        cd.openCurrentSessionWithTransaction();
        List<CategoryIdea> allCategories = cd.findAllCategories();
        cd.closeCurrentSessionwithTransaction();
        return allCategories;
    }
}
