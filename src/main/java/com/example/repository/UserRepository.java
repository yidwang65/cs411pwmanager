package com.example.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.example.model.User;


//<domain model class, type of primary key>
public interface UserRepository  extends JpaRepository<User, Long>{
    User findByuid(int uid);

    User findByemail(String email);

}


 
 
