package com.example.demo.Controller;

import com.example.demo.Service.*;

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
    @Autowired
    protected AccountService Accounts;
    @Autowired
    protected CartService Carts;
}
