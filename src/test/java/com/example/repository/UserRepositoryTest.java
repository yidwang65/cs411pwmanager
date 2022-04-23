package com.example.repository;

import com.example.Model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    @Test
    public void getAllUsers() {
        UserRepository.getAllUsers();
    }

    @Test
    public void getUserByEmail(){
        User user = UserRepository.getUserByEmail("john123@gmail.com");
        System.out.println(user);
    }
}