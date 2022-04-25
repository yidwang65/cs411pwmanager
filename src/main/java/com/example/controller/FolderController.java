package com.example.controller;

import com.example.model.Folder;
import com.example.repository.FolderRepository;
import com.example.service.FolderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.repository.query.Param;


@Controller
@RequestMapping("/folders")
public class FolderController {
	
	    @Autowired
	    FolderService folderService;
	    
		@Autowired
	    private FolderRepository folderRepo;

	     
	  // @GetMapping("")
	 //   public String viewHomePage() {
	  //     return "home";
	   // }

//		@RequestMapping(path = "/", method = RequestMethod.GET)
		@GetMapping()
	    public String getFolders(Model model) {
	   	model.addAttribute("folders", folderService.getAllFolders());
	   	return "folders";
	    }	
		
	    @GetMapping("/createFolder")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("folder", new Folder()); 
	        return "createFolder";
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