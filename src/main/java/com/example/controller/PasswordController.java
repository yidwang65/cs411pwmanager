package com.example.controller;

import com.example.Model.Password;
import com.example.service.PasswordService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.repository.query.Param;

@Controller
@RequestMapping("/password")
public class PasswordController {

    @Autowired
    PasswordService passwordService;

    @GetMapping()
    public String getAll(Model model){
        model.addAttribute("passwords", passwordService.getAllPasswords());
        return "password";
    }

    @Transactional
    @PostMapping("/delete")
    public String delete(@RequestParam(name = "pid") String pid) {
        System.out.println(pid);
        int id = Integer.parseInt(pid);
        passwordService.deletePassword(id);
        return "redirect:/password";
    }
    
    @RequestMapping(path = {"/search"})
    public String home(Password password, Model model, String keyword) {
    	if(keyword!=null) {
    		List<Password> list = passwordService.getByKeyword(keyword);
            model.addAttribute("passwords", list);	
    	}
    	else {
    		List<Password> list = passwordService.getAllPasswords();
    		model.addAttribute("passwords", list);
    	}
    	return "password";
    }

}
