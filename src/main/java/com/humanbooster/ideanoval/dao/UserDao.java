package com.humanbooster.ideanoval.dao;

import com.humanbooster.ideanoval.models.User;
import org.hibernate.Session;

/**
 * Created by Nea on 23/10/2016.
 */
public interface UserDao {
    public boolean addUser(User user);

    public User findByEmailAndPassword(String email, String password);

    public void updateUser(User user);

    public void deleteUser(User user);

    public Session openCurrentSessionWithTransaction();

    public void closeCurrentSessionwithTransaction();

    public User findUserById(int id);
}
