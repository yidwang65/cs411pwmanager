package com.example.model;


import javax.persistence.*;

@Entity
@Table(name = "passwords")
public class Password  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    private String password;
    private String username;
    private String pw_for;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id", referencedColumnName="folder_id")
    private Folder folder;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", referencedColumnName="uid")
    private User user;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}