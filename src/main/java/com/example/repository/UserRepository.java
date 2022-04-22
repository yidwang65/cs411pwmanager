package com.example.repository;

import java.sql.*;
import com.example.model.User;

public class UserRepository {
    static final String DB_URL = "jdbc:mysql://localhost/pwmanager";
    static final String USER =
            "root";
    static final String PASS = "root";




    public static void getAllUsers() {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users;")) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("User ID: " + rs.getInt("uid"));
                System.out.print(", First Name: " + rs.getString("first_name"));
                System.out.println(", Last Name: " + rs.getString("last_name"));
                System.out.println(", Email: " + rs.getString("email"));
                System.out.println(", Password: " + rs.getString("password"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User getUserByEmail(String email) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM users WHERE email='%s'",email))) {
            // Extract data from result set
            if (rs.next()) {
                return new User(rs.getInt("uid"),rs.getString("first_name"),rs.getString("last_name"),rs.getString(
                        "email"),rs.getString("password"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}