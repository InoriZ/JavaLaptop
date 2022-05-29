package com.example.demo.Service;

import com.example.demo.Model.Category;

import com.example.demo.Model.Product;
import com.example.demo.SideModel.ReturnJsonObject;

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
    
    public Object deleteCategorybyId (int idCategory){
        
        var cate = Categories.getById(idCategory);
        var listProduct = Products.findByCategory(cate);
        for (Product product : listProduct) {
            for (var cart : product.getProductCarts()) {
                var invoice = cart.getCart().getInvoice();
                if(invoice !=null){
                    return new ReturnJsonObject(false, "Không thể xoá danh mục này. Đã có khách hàng mua sản phẩm trong danh mục này", "");

                }

            }
        }
        Categories.delete(cate);

        return new ReturnJsonObject(true, "Xoá danh mục thành công", "");


        

    }

}
