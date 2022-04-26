 
//package com.example.repository;
//
//import com.example.model.User;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.junit.Assert.*;
//
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void getUserByEmail(){
//        com.example.model.User user = userRepository.findByemail("john123@gmail.com");
//        System.out.println(user);
//    }
//}
 
package com.example.repository;

import com.example.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    @Test
    public void getAllUsers() {
    	
       // UserRepository.getAllUsers();
    }

    @Test
    public void getUserByEmail(){
       // User user = UserRepository.getUserByEmail("john123@gmail.com");
      //  System.out.println(user);
    }
}
 
