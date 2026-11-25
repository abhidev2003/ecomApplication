package com.jsp.ecomApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    private Integer id;
    private String name ;
    private String imageUrl;
    private double price;
    private String description;
    private int quantity;
    private Cat category;
}
