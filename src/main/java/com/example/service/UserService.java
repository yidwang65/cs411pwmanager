package com.example.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.Model.User;
import com.example.repository.UserRepository;
@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

}
