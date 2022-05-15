package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productcart")
public class ProductCart implements Serializable{
    @EmbeddedId
    ProductCartKey id;


    @OneToOne
    @MapsId("idProduct")
    @JoinColumn(name = "idproduct")
    Product product;

    @OneToOne
    @MapsId("idCart")
    @JoinColumn(name = "idcart")
    Cart cart;

    int quantity;

    @Column(name = "paymentprice")
    Integer paymentPrice;


    
    public ProductCart() {
    }

    

    public ProductCart( Cart cart, Product Product, int quantity) {
        this.id = new ProductCartKey(cart.getIdCart(), Product.getIdProduct());
        this.product = Product;
        this.cart = cart;
        this.quantity = quantity;
        this.paymentPrice = Product.getPrice();
    }



    public ProductCart(ProductCartKey id, int quantity, Integer paymentPrice) {
        this.id = id;
        this.quantity = quantity;
        this.paymentPrice = paymentPrice;
    }



    public ProductCart(ProductCartKey id, Product product, Cart cart, int quantity, Integer paymentPrice) {
        this.id = id;
        this.product = product;
        this.cart = cart;
        this.quantity = quantity;
        this.paymentPrice = paymentPrice;
    }



    public ProductCartKey getId() {
        return id;
    }



    public void setId(ProductCartKey id) {
        this.id = id;
    }



    public Product getProduct() {
        return product;
    }



    public void setProduct(Product product) {
        this.product = product;
    }



    public Cart getCart() {
        return cart;
    }



    public void setCart(Cart cart) {
        this.cart = cart;
    }



    public int getQuantity() {
        return quantity;
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public Integer getPaymentPrice() {
        return paymentPrice;
    }



    public void setPaymentPrice(Integer paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public Integer getTotal(){
        return product.getPrice() * this.quantity;
    }

    

}
