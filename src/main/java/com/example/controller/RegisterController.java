package com.example.controller;

import com.example.Model.User;
import com.example.service.UserService;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RegisterController {

  private final UserService userService;

  public RegisterController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
	}

  @RequestMapping(value = "register", method = RequestMethod.POST)
  public String createUser(Model model, @ModelAttribute User user) {
    User u = userService.createUser(user);
    return "home";
  }
}