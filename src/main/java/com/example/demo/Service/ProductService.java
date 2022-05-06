package com.example.demo.Service;


import com.example.demo.Model.Category;
import com.example.demo.Model.Product;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService extends BaseService{

    public Product getProduct(){
        return Products.getById(1);
    }
    public List<Product> getProductByCategory(int id){
        Category category = Categories.getById(id);
        return Products.findByCategory(category);
    }
//    public Product getFullInfoProduct(int id){
//        Product product = Products.getById(id);
//        product.setProductattributes();
//    }
    public List<Product> getAllProduct(){
        return Products.findAll();
    }

    public Product getProductDetail(Integer id){
        return Products.getById(id);        
    }
    public void SaveProduct(Product product, Integer idCate)
    {
        var category=Categories.getById(idCate);
        product.setCategory(category);
        this.Products.save(product);
    }
}
