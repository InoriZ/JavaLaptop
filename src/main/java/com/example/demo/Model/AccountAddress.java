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
@Table(name = "Accountaddress")
public class AccountAddress implements Serializable {
    
    @EmbeddedId
    AccountAddressKey key;

    @OneToOne
    @MapsId("idAccount")
    @JoinColumn(name = "idaccount")
    Account account;

    @OneToOne
    @MapsId("idAddress")
    @JoinColumn(name = "idaddress")
    Address address;
    
    @Column(name = "isdefault")
    Boolean isDefault;

    public AccountAddress() {
    }

    public AccountAddress( Account account, Address address, Boolean isDefault) {
        this.key = new AccountAddressKey(address.getIdAddress(), account.getIDAccount());
        this.account = account;
        this.address = address;
        this.isDefault = isDefault;
    }

    public AccountAddressKey getKey() {
        return key;
    }

    public void setKey(AccountAddressKey key) {
        this.key = key;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    
}
