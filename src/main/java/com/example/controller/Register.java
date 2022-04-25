package com.example.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.validation.BindingResult;

import java.sql.*;
import com.example.model.Newuser;

@RequestMapping(value = "/Register", method = RequestMethod.POST)
public class Register {
    static final String myUrl = "jdbc:mysql://localhost/pwmanager";
    static final String USER =
            "root";
    static final String PASS = "root";

    public static void register(@Valid @ModelAttribute("user")Newuser user, 
      BindingResult result) { 
         if(result.hasErrors()){
            return;
         }

         if(!(user.getPassword1()).equals(user.getPassword2())){
            return;
         }

        // Connecting to DB
        try{
            Connection conn = DriverManager.getConnection(myUrl, USER, PASS);
            // the mysql insert statement
            String query = " insert into users (uid, first_name, last_name, email, password)"
            + " values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, user.getUid());
            preparedStmt.setString(2, user.getFirst_name());
            preparedStmt.setString(3, user.getLast_name());
            preparedStmt.setString(4, user.getEmail());
            preparedStmt.setString(4, user.getPassword1());
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }


    }


}