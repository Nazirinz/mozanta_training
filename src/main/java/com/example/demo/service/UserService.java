package com.example.demo.service;

import java.util.List;

import com.example.demo.models.User;

public interface UserService {

    User saveUser(User user);

    List<User> getuserList();

    User getallUser(String id);

    User updatedUser(String id);
    
    void deleteUser(String id);
}
