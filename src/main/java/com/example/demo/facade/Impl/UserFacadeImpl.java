package com.example.demo.facade.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.facade.UserFacade;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
@Component
public class UserFacadeImpl implements UserFacade{
    @Autowired
    private UserService userService;
    @Override
    public User saveUser(User user) {
       return userService.saveUser(user);
    }
    @Override
    public List<User> getuserList() {
        return userService.getuserList();
    }
    @Override
    public User getallUser(String id) {
       return userService.getallUser(id);
    }
    @Override
    public User updateUser(String id, User updatedUser) {
        return userService.updatedUser(id);
    }
    
}
