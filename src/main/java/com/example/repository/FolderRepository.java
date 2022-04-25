package com.example.repository;

import com.example.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//<domain model class, type of primary key>
@Repository
public interface FolderRepository  extends JpaRepository<Folder, Long>{

}