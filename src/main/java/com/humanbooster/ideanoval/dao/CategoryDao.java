package com.humanbooster.ideanoval.dao;

import com.humanbooster.ideanoval.models.CategoryIdea;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Julie on 01/11/2016.
 */
public interface CategoryDao {

    public boolean addCategory(CategoryIdea categoryIdea);

    public List<CategoryIdea> findAllCategories();

    public Session openCurrentSessionWithTransaction();

    public void closeCurrentSessionwithTransaction();
}
