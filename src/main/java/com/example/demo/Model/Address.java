package com.example.demo.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaddress")
    Integer idAddress;
    String address;
    String phone;
    String receiver;

    @JsonIgnore
    @OneToMany(mappedBy = "address")
    List<AccountAddress> accountAddresses = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "address")
    List<Invoice> invoices = new ArrayList<>();

    public Address() {
    }
    

    public Address(Integer idAddress, String address, String phone, String receiver) {
        this.idAddress = idAddress;
        this.address = address;
        this.phone = phone;
        this.receiver = receiver;
    }


    public Address(Integer idAddress, String address, String phone, String receiver,
            List<AccountAddress> accountAddresses) {
        this.idAddress = idAddress;
        this.address = address;
        this.phone = phone;
        this.receiver = receiver;
        this.accountAddresses = accountAddresses;
    }

    public Address(String address, String phone, String receiver) {
        this.address = address;
        this.phone = phone;
        this.receiver = receiver;
    }


    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public List<AccountAddress> getAccountAddresses() {
        return accountAddresses;
    }

    public void setAccountAddresses(List<AccountAddress> accountAddresses) {
        this.accountAddresses = accountAddresses;
    }

    
    
    
}
