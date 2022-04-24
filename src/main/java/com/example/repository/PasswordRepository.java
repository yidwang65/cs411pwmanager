package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.example.Model.Password;

import java.util.List;

//<domain model class, type of primary key>
@Repository
public interface PasswordRepository  extends JpaRepository<Password, Long>{

    Long deleteBypid(int pid);
    
    //custom query
    @Query(value = "SELECT * FROM passwords p WHERE p.password LIKE %:keyword% OR p.username LIKE %:keyword% OR p.pw_for LIKE %:keyword%", nativeQuery = true)
    List<Password> findByKeyword(@Param("keyword") String keyword);
}
