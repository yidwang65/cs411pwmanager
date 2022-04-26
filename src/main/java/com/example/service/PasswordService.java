package com.example.service;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.Model.Password;
import com.example.repository.PasswordRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    public Password save(Password pass){
        return passwordRepository.save(pass);
    }
}