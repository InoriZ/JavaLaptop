package com.example.demo.Service;

import com.example.demo.Model.Category;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService extends BaseService{

    public Category GetACategory(int id){return Categories.getById(id);}
    public List<Category> GetAllCategory(){
        return Categories.findAll();
    }
    public void SaveCategory(Category category)
    {
        this.Categories.save(category);
    }
    public Category getCategorybyid (int idCategory){
        Optional <Category> optional = Categories.findById(idCategory);
        Category category = null;
        if(optional.isPresent()){
            category = optional.get();
        }else {
            throw new RuntimeException("Category not found for id::" + idCategory);
        }
        return category;
    }
    
    public void deleteCategorybyId (int idCategory){
        Categories.deleteById(idCategory);
    }

}
