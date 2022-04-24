package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.Folder;


//<domain model class, type of primary key>
public interface FolderRepository  extends JpaRepository<Folder, Long>{

}
