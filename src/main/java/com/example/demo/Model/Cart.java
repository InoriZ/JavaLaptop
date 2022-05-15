package com.example.demo.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table
public class Cart implements Serializable{
    @Id
    @Column(name = "idcart")
    @Type(type = "uuid-char")
    UUID idCart;
    @Column(name = "isexpired")
    Boolean isExpired;
    
    @ManyToOne
    @JoinColumn(name = "idaccount")
    Account account;

    @OneToMany(mappedBy = "cart")
    List<ProductCart> ProductCarts = new ArrayList<>();

    @OneToOne(mappedBy = "cart")
    Invoice invoice;


    public Cart(){
        
    }
    public Cart(UUID idCart, Boolean isExpired, Account account) {
        this.idCart = idCart;
        this.isExpired = isExpired;
        this.account = account;
    }
    public UUID getIdCart() {
        return idCart;
    }
    public void setIdCart(UUID idCart) {
        this.idCart = idCart;
    }
    public Boolean getIsExpired() {
        return isExpired;
    }
    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public List<ProductCart> getProductCarts() {
        return ProductCarts;
    }
    public void setProductCarts(List<ProductCart> productCarts) {
        ProductCarts = productCarts;
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Integer getCartTotal(){
        Integer total = 0;
        for (ProductCart productCart : ProductCarts) {
            total+= productCart.getTotal();
        }
        return total;
    }
    

    
    

    

}
