package com.example.demo.Controller;

import com.example.demo.Service.AttributeService;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductAttributeService;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    protected ProductService Products;
    @Autowired
    protected CategoryService Categories;
    @Autowired
    protected AttributeService Attributes;
    @Autowired
    protected ProductAttributeService ProductAttributes;
}
