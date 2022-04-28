package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategory")
    int idCategory;

    @NotEmpty(message = "Thiếu Tên Danh Mục")
    @Column(name = "categoryname")
    String categoryName;
    @JsonIgnore
    @OneToMany(mappedBy = "idProduct",cascade = CascadeType.ALL)

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }


    @Column(name = "isdelete")
    Boolean isDelete;

    public Category() {
    }

    public Category( String categoryName, Boolean isDelete) {

        this.categoryName = categoryName;
        this.isDelete = isDelete;
    }
}
