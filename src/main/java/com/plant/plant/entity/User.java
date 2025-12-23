package com.plant.plant.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Avoid using reserved keyword "user" in MySQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // username must be unique
    private String username;

    @Column(nullable = false) // password must not be null
    private String password;

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}