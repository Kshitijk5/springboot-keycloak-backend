package com.ezbytes.SpringbootSecuritydemo.entity;

import lombok.Data;

@Data
public  class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and setters (or use Lombok for automatic generation)
}