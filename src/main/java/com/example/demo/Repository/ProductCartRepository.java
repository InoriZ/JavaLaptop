package com.example.demo.Repository;

import com.example.demo.Model.ProductCart;
import com.example.demo.Model.ProductCartKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCart,ProductCartKey>{
    
}
