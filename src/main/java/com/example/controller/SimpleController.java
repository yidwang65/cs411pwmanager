package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simple")
public class SimpleController {

   // @GetMapping("/testing")
    //public String homePage(Model model) {
     //  model.addAttribute("appName", "TESTING");
      //  return "home";
    //}
    
    
	 @GetMapping("")
	 public String viewHomePage() {
		 return "home";
	 }
    
}