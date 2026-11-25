package com.jsp.ecomApp.dao;

import com.jsp.ecomApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
