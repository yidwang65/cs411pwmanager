package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;
@Controller
@RequestMapping(value = "/Register", method = RequestMethod.POST)
public class RegisterController{
    static final String myUrl = "jdbc:mysql://localhost";
    static final String USER =
            "root";
    static final String PASS = "localhost";


    
    @PostMapping(value = "/Register")
    public static String register(@RequestParam(name = "first_name") String firstname, 
    		@RequestParam(name = "last_name") String lastname, @RequestParam(name = "email") String email, 
    		@RequestParam(name = "password1") String password1, @RequestParam(name = "password2") String password2  ) { 


        // Connecting to DB
        try{
            Connection conn = DriverManager.getConnection(myUrl, USER, PASS);
            // the mysql insert statement
            String query = " insert into users (first_name, last_name, email, password)"
            + " values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, firstname);
            preparedStmt.setString(2, lastname);
            preparedStmt.setString(3, email);
            preparedStmt.setString(4, password1);
            preparedStmt.execute();
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;

    }


}