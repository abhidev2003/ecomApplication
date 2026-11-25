package com.jsp.ecomApp.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int id;
    private int name ;
    private String email;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
}


