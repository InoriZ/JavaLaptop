package com.example.demo.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="Idproduct")
    int idProduct;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    Category category;
    String name;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    List<ProductAttribute> productAttributes = new ArrayList<>();

    public Product() {
    }

    public Product( Category category, String name, int price, Integer stock, String imageUrl, Boolean isDelete, String description) {

        this.category = category;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.isDelete = isDelete;
        this.description = description;
    }

    Integer price;
    Integer stock;
    @Column(name="imageurl")
    String imageUrl;
    @Column(name="isdelete")
    Boolean isDelete;
    String description;
    

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public List<ProductAttribute> getProductAttributes() {
        return productAttributes;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setProductAttributes(List<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
