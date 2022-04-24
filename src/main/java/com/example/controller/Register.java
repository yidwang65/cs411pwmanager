package com.example.controller;


import javax.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;




import java.sql.*;
import com.example.Model.Newuser;

@Controller
public class Register {
    static final String myUrl = "jdbc:mysql://localhost/pwmanager";
    static final String USER =
            "root";
    static final String PASS = "criesinpain";
    
    @PostMapping(value = "/Register")
    public static String register(@RequestParam(name = "first_name") String firstname, 
    		@RequestParam(name = "last_name") String lastname, @RequestParam(name = "email") String email, 
    		@RequestParam(name = "password1") String password1, @RequestParam(name = "password2") String password2  ) { 

    	if(!(password1.equals(password2))) {
    		return null;
    	}

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
            conn.close();
            return null;
        }catch(SQLException e) {
            e.printStackTrace();
        }

        return "hello";
    }


}