package com.humanbooster.ideanoval.service.impl;

import com.humanbooster.ideanoval.dao.UserDao;
import com.humanbooster.ideanoval.dao.impl.UserDaoImpl;
import com.humanbooster.ideanoval.models.User;
import com.humanbooster.ideanoval.service.UserService;

/**
 * Created by Nea on 23/10/2016.
 */
public class UserServiceImpl implements UserService{

    private UserDao ud = new UserDaoImpl();

    @Override
    public User addUser(String pseudo, String email, String password) {
        User user = new User(pseudo, email, password);
        ud.openCurrentSessionWithTransaction();
        ud.addUser(user);
        ud.closeCurrentSessionwithTransaction();
        return user;
    }

    @Override
    public User login(String email, String password) {
        ud.openCurrentSessionWithTransaction();
        User user = ud.findByEmailAndPassword(email, password);
        ud.closeCurrentSessionwithTransaction();
        return user;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public User getUserById(String id) {
        if (id == null) {
            return null;
        } else {
            ud.openCurrentSessionWithTransaction();
            User user = ud.findUserById(Integer.parseInt(id));
            ud.closeCurrentSessionwithTransaction();
            return user;
        }
    }
}
