package com.example.demo.Service;


import com.example.demo.Model.Attribute;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.AttributeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductService {
    @Autowired
    ProductRepository Product; AttributeRepository Attribute;
    public Product getProduct(){
        return Product.getById(1);
    }
    
    public Attribute getAttribute(){
        return Attribute.getById(1);
    }

}


