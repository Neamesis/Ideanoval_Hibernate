package com.humanbooster.ideanoval.service;

import com.humanbooster.ideanoval.models.User;

/**
 * Created by Nea on 23/10/2016.
 */
public interface UserService {

    public User addUser(String pseudo, String email, String password);

    public User login(String email, String password);

    public void updateUser(User user);

    public void deleteUser(User user);

}
