package com.example.demo.Model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table
public class Invoice {
    
    @Id
    @Type(type = "uuid-char")

    @Column(name = "idinvoice")
    UUID idIvoice;
    @Column(name = "datecreated")
    Date dateCreated;
    @Column(name = "dateexpired")
    Date dateExpired;

    @OneToOne
    @JoinColumn(name = "idcart")
    Cart cart;
    @ManyToOne
    @JoinColumn(name = "idaddress")
    Address address;
    @ManyToOne
    @JoinColumn(name = "idstatus")
    Status status;

    
    public Invoice() {
    }


    public Invoice(UUID idIvoice, Date dateCreated, Date dateExpired, Cart cart, Address address, Status status) {
        this.idIvoice = idIvoice;
        this.dateCreated = dateCreated;
        this.dateExpired = dateExpired;
        this.cart = cart;
        this.address = address;
        this.status = status;
    }


    public UUID getIdIvoice() {
        return idIvoice;
    }


    public void setIdIvoice(UUID idIvoice) {
        this.idIvoice = idIvoice;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public Date getDateExpired() {
        return dateExpired;
    }


    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }


    public Cart getCart() {
        return cart;
    }


    public void setCart(Cart cart) {
        this.cart = cart;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }

    
}
