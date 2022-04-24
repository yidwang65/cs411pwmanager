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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid", referencedColumnName="uid")
    User user;

    //getters and setters


    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Folder [id" + folder_id + ", Name=" + fname + "]";
    }
}