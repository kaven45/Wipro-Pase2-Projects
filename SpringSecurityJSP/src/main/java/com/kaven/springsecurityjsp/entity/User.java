package com.kaven.springsecurityjsp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String role; 

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role;
    } 
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }

    public User() {}  // No-arg constructor for JPA


}

