package com.jsp.ecomApp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name ;
    private String email;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToMany
    private List<Order> orders;
}


