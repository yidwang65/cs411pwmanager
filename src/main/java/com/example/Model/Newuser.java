package com.example.model;

import javax.persistence.*;

public class  Newuser{
    private int uid;

    private String first_names;

    private String last_name;

    private String email;

    private String password1;

    private String password2;

    public Newuser(){
        this.uid = -1;
        this.first_name = null;
        this.last_name = null;
        this.email = null;
        this.password1 = null;
        this.password2 = null;
    }

    public Newuser(int uid, String first_name, String last_name, String email, String password1, String password2){
        this.uid = uid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password1='" + password1 + '\'' +
                ", password2='" + password2 + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public void setPassword2(String password1) {
        this.password2 = password1;
    }   
}