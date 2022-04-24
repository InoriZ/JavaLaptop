package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProductAttributeKey implements Serializable {
    @Column(name = "idattribute")
    int IdAttribute;
    @Column(name = "idproduct")
    int IdProduct;

    public int getIdAttribute() {
        return IdAttribute;
    }

    public void setIdAttribute(int idAttribute) {
        IdAttribute = idAttribute;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }
}
