package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.facade.UserFacade;
import com.example.demo.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserFacade userFacade;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userFacade.saveUser(user);
    }

    @GetMapping("/alluser")
    public List<User> getuserList() {
        return userFacade.getuserList();
    }

    @GetMapping("/{id}")
    public User getallUser(@PathVariable String id) {
        return userFacade.getallUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        return userFacade.updateUser(id, updatedUser);
    }

}
