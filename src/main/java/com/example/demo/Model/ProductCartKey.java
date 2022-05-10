package com.example.demo.Model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;


@Embeddable
public class ProductCartKey implements Serializable {
    @Column(name = "idcart")
    @Type(type = "uuid-char")

    UUID idCart;
    @Column(name = "idproduct")
    int idProduct;
    public ProductCartKey() {
    }
    public ProductCartKey(UUID idCart, int idProduct) {
        this.idCart = idCart;
        this.idProduct = idProduct;
    }
    public UUID getIdCart() {
        return idCart;
    }
    public void setIdCart(UUID idCart) {
        this.idCart = idCart;
    }
    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
    
}
