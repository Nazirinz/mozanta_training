package com.example.demo.facade;

import java.util.List;

import com.example.demo.models.User;

public interface UserFacade {

    User saveUser(User user);

    List<User> getuserList();

    User getallUser(String id);

    User updateUser(String id, User updatedUser);

   
}
