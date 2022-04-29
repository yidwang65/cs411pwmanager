package com.example.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.model.User;
import com.example.repository.UserRepository;
@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  //get all the users
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  //create the users
  public User createUser(User user) {
    return userRepository.save(user);
  }

}