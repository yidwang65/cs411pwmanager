package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int folder_id;


    @Column(nullable = false, unique = true, length = 45)
    private String fname;

    //need to foreign reference user too
    //@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid", referencedColumnName="uid")
    private Integer uid;
    //private User user;
    
    
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

  	/*
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    */

  	public Integer getUid() {
  		return uid;
  	}

  	public void setUid(Integer uid) {
  		this.uid = uid;
  	}

    @Override
    public String toString() {
        return "Folder [id" + folder_id + ", Name=" + fname + "]";
    }
}