package com.example.demo.ServiceImplement;

import java.util.List;

import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getallCategories(){
        return categoryRepository.findAll();
    }
}
