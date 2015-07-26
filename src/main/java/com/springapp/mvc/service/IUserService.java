package com.springapp.mvc.service;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by heval-Computer on 26.7.2015.
 */
public interface IUserService {
    public void saveUser(User user);
    public void deleteUser(int userId);
    public User getUser(int userId);
    public List<User> getUserList();
}
