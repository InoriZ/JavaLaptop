package com.example.demo.Repository;

import com.example.demo.Model.ProductAttribute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttributeRepository extends JpaRepository<ProductAttribute ,Integer >{
    public ProductAttribute findById(int id);
}
