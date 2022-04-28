package com.example.controller;

import com.example.Model.User;
import com.example.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController {

  private final UserService userService;

  public RegisterController(UserService userService) {
    this.userService = userService;
  }



  @RequestMapping(value = "", method = RequestMethod.POST)
  public String createUser(Model model, @ModelAttribute User user) {
    User u = userService.createUser(user);
    return "home";
  }
}