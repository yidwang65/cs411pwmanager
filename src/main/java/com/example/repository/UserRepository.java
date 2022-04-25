package com.example.repository;

 
import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


//<domain model class, type of primary key>
public interface UserRepository  extends JpaRepository<User, Long>{
    User findByuid(int uid);

    User findByemail(String email);

}


 
 
