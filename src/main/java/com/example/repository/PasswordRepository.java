package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.example.model.Password;

import java.util.List;

//<domain model class, type of primary key>
@Repository
public interface PasswordRepository  extends JpaRepository<Password, Long>{

    Long deleteBypid(int pid);
    
    //custom query to find passwords containing keywords
    @Query(value = "SELECT * FROM passwords p WHERE p.password LIKE %:keyword% OR p.username LIKE %:keyword% OR p.pw_for LIKE %:keyword%", 
    		nativeQuery = true)
    List<Password> findByKeyword(@Param("keyword") String keyword);
    
    
    //custom query to find passwords belonging to a specific folder
    @Query(value = "SELECT * FROM passwords p WHERE p.folder_id = :folderid", nativeQuery = true)
    List<Password> findByFolderid(@Param("folderid") Integer folderid);
    
    //custom query to find specific password row
    @Query(value = "SELECT * FROM passwords p WHERE p.pid = :passwordid", 
    		nativeQuery = true)
    Password findByPasswordId(@Param("passwordid") Integer passwordid);
   
}
