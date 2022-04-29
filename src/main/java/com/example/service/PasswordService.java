package com.example.service;

import java.util.List;

import com.example.model.Password;
import com.example.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService
{

    @Autowired
    private PasswordRepository passwordRepository;

    public boolean deletePassword(int pid){
        passwordRepository.deleteBypid(pid);
        return true;
    }

    public List<Password> getAllPasswords(){
        return passwordRepository.findAll();
    }
    
    //searches and returns password that matches keyword
    public List<Password> getByKeyword(String keyword){
    	return passwordRepository.findByKeyword(keyword);
    }
    
    //searches and returns password that matches folderid
    public List<Password> getByFolderid(Integer folderid){
    	return passwordRepository.findByFolderid(folderid); 
    }
    
    //searches and returns password that matches passwordid
    public Password getByPasswordid(Integer passwordid){
    	return passwordRepository.findByPasswordId(passwordid); 
    }
    
    //searches for password that matches passwordid and updates folderid
    public Password updatePwFolderid(Integer folderid, Integer passwordid) {
    	return passwordRepository.updatePasswordFolder_id(folderid, passwordid);
    }
    
    //save the password
    public Password save(Password pass){
        return passwordRepository.save(pass);
    }

}