package com.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

import com.example.model.*;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        com.example.model.User user = userRepository.findByemail(username);
        return User.withUsername(user.getEmail()).password(passwordEncoder.encode(user.getPassword())).roles("USER").build();

 
//        com.example.model.User user = UserRepository.getUserByEmail(username);
//        if (user != null){
//            return User.withUsername(user.getEmail())
//                    .password(passwordEncoder.encode(user.getPassword()))
//                    .roles("USER").build();
//        }
//
//        return null;
 
    }
}