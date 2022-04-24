package com.example.repository;

import com.example.Model.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//<domain model class, type of primary key>
public interface PasswordRepository  extends JpaRepository<Password, Long>{

    Long deleteBypid(int pid);
}
