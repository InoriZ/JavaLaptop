package com.example.demo.Model;


import javax.persistence.*;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="IDCategory")
    int IDCategory;

    @Column(name = "categoryname")
    String CategoryName;
    Boolean Isdelete;
    public int getIDCategory() {
        return IDCategory;
    }
    public void setIDCategory(int iDCategory) {
        IDCategory = iDCategory;
    }
    public String getCategoryName() {
        return CategoryName;
    }
    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
    public Boolean getIsdelete() {
        return Isdelete;
    }
    public void setIsdelete(Boolean isdelete) {
        Isdelete = isdelete;
    }
}
