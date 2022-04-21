package com.example.demo.Service;

import com.example.demo.Repository.AttributeRepository;
import com.example.demo.Repository.CategoryRepository;

import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected AttributeRepository Attributes;
    @Autowired
    protected CategoryRepository Categories;

    @Autowired
    protected ProductRepository Products;
}
