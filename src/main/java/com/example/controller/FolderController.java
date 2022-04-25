package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.model.Folder;
import com.example.repository.FolderRepository;
import com.example.service.FolderService;
import com.example.service.PasswordService;

@Controller
public class FolderController {
		@Autowired
	    private FolderRepository folderRepo;
		
	    @Autowired
	   	FolderService folderService;
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "home";
	    }
	    
	    @GetMapping("/createFolder")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("folder", new Folder()); 
	        return "createFolder";
	    }
	    
	    //to display created folders on the html 
	    @GetMapping("/allFolders")
	    public String getAllFolders(Model model){
	        model.addAttribute("folders", folderService.getAllFolders());
	        return "password";
	    }

	    @PostMapping("/process_folder")
	    public String processFolder(Folder folder) {
	        
	    	//User1
	    	int uid = 1;
	    	
	    	folder.setUid(uid);
	    	folder.setFname(folder.getFname());
	        folderRepo.save(folder);
	         
	        return "createSuccess";
	    }
}