package com.jsp.ecomApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    private Integer id;
    private double subTotal;
}


