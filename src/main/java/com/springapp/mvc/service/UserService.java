package com.springapp.mvc.service;

import com.springapp.mvc.dao.IUserDAO;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by heval-Computer on 26.7.2015.
 */

@Transactional
@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO dao;

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        dao.deleteUser(userId);
    }

    @Override
    public User getUser(int userId) {
       return dao.getUser(userId);
    }

    @Override
    public List<User> getUserList() {
        return dao.getUserList();
    }
}
