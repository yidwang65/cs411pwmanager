package com.example.repository;

import com.example.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;


//<domain model class, type of primary key>
public interface FolderRepository  extends JpaRepository<Folder, Long>{

}