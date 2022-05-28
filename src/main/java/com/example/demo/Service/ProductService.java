package com.example.demo.Service;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.SideModel.ReturnJsonObject;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService extends BaseService {

    public Product getProduct() {
        return Products.getById(1);
    }

    public List<Product> getProductByCategory(int id) {
        Category category = Categories.getById(id);
        return Products.findByCategory(category);
    }

    // public Product getFullInfoProduct(int id){
    // Product product = Products.getById(id);
    // product.setProductattributes();
    // }
    public List<Product> getAllProduct() {
        return Products.findAll();
    }

    public Product getProductDetail(Integer id) {
        return Products.getById(id);
    }

    public void SaveProduct(Product product, Integer idCate) {
        var category = Categories.getById(idCate);
        product.setCategory(category);
        this.Products.save(product);
    }

    public Product getProductbyid(Integer idProduct) {
        Optional<Product> optional = Products.findById(idProduct);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException("Product not found for id::" + idProduct);
        }
        return product;
    }
    public List<Product> getProductByName(String name){
        return Products.findByNameIsContaining(name);
    }
    public Object deleteProductbyId (int idProduct){
        
        var product = Products.getById(idProduct);
        for (var cart : product.getProductCarts()) {
            var invoice = cart.getCart().getInvoice();
            if(invoice !=null){
                return new ReturnJsonObject(false, "Không thể xoá sản phẩm này. Đã có khách hàng mua sản phẩm này", "");

            }

        }
        Products.delete(product);

        return new ReturnJsonObject(true, "Xoá sản phẩm thành công", "");


        

    }
}