package com.example.demo.Service;

import com.example.demo.Model.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends BaseService{

    public Category GetACategory(int id){return Categories.getById(id);}
    public List<Category> GetAllCategory(){
        return Categories.findAll();
    }

}
