package com.example.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

	@Column(nullable = false, unique = true, length = 45)
    private String first_name;

	@Column(nullable = false, unique = true, length = 45)
    private String last_name;
	
	@Column(nullable = false, unique = true, length = 80)
    private String email;

	@Column(nullable = false, unique = true, length = 45)
    private String password;

	//new
	/*
	private boolean enabled;
	
	 @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	 @JoinTable(
		 name = "users_roles",
		 joinColumns = @JoinColumn(name = "user_id"),
		 inverseJoinColumns = @JoinColumn(name = "role_id")
		 )
		 private Set<Role> roles = new HashSet<>();
	 
	//new end
	*/
	
    public User(int uid, String first_name, String last_name, String email, String password){
        this.uid = uid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
    
    

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
// getters and setters...

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}