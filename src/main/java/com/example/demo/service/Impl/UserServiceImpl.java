package com.example.demo.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public User saveUser(User user) {
    user.setCreatedDate(new Date());
    user.setUpdatedDate(new Date());
    return userRepository.save(user);
  }

  @Override
  public List<User> getuserList() {
    return userRepository.findAll();
  }

  @Override
  public User getallUser(String id) {
    return userRepository.findById(id).get();
  }

  @Override
  public User updatedUser(String id) {
    return userRepository.findById(id).get();
  }

  @Override
  public void deleteUser(String id) {
    userRepository.deleteById(id);
  }

}
