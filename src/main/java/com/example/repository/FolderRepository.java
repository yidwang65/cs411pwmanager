package com.example.repository;

import com.example.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//<domain model class, type of primary key>
@Repository
public interface FolderRepository  extends JpaRepository<Folder, Long>{

}