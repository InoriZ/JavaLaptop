package com.example.demo.Controller;

import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    protected ProductService Product;
}
