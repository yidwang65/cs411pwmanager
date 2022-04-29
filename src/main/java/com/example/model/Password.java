package com.example.Model;


import javax.persistence.*;

@Entity
@Table(name = "passwords")
public class Password  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    private String inputpassword;
    private String username;
    private String pw_for;

    //@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id", referencedColumnName="folder_id")
    private Integer folder_id;

    //@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", referencedColumnName="uid")
    private Integer uid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getinputpassword() {
        return inputpassword;
    }

    public void setinputpassword(String inputpassword) {
        this.inputpassword = inputpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw_for() {
        return pw_for;
    }

    public void setPw_for(String pw_for) {
        this.pw_for = pw_for;
    }

    public Integer getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(Integer folder_id) {
        this.folder_id = folder_id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}