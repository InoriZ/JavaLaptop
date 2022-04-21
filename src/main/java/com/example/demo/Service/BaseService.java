package com.example.demo.Service;

import com.example.demo.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    protected AttributeRepository Attributes;
    @Autowired
    protected CategoryRepository Categories;

    @Autowired
    protected ProductRepository Products;
}
