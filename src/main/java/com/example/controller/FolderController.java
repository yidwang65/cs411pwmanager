package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Model.Folder;
import com.example.repository.FolderRepository;

@Controller
public class FolderController {
	  @Autowired
	    private FolderRepository folderRepo;
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "home";
	    }
	    
	    @GetMapping("/createFolder")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("folder", new Folder()); 
	        return "createFolder";
	    }
	    

	
	    @PostMapping("/process_folder")
	    public String processFolder(Folder folder) {
	        
	    	//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        //String encodedPassword = passwordEncoder.encode(user.getPassword());
	        //user.setPassword(encodedPassword);
	        //stores the hash value of the pw in db not the actual db
	    	int uid = 1;
	    	folder.setUid(uid);
	    	folder.setFname(folder.getFname());
	        folderRepo.save(folder);
	         
	        return "createSuccess";
	    }
}

