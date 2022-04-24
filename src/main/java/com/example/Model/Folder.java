package com.example.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "folders")
public class Folder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer folder_id;
	

    @Column(nullable = false, unique = true, length = 45)
    private String fname;

    @Column(nullable = false, unique = true, length = 45)
    private Integer uid;

    
    //getters and setters
	public Integer getFolder_id() {
		return folder_id;
	}

	public void setFolder_id(Integer folder_id) {
		this.folder_id = folder_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}


    @Override
    public String toString() {
        return "Folder [folder_id" + folder_id + ", FName=" + fname + ", User=" + uid + "]";
    }   
}
