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
public class OrderItem {
    @Id
    private String product;

//    private Integer id;
//    private int name ;
//    private int imageUrl;
//    private double price;
//    private String description;
//    private int quantity;
//    private String category;
}
