package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountAddressKey implements Serializable {
    
    @Column(name = "idaddress")
    Integer idAddress;
    @Column(name = "idaccount")
    String idAccount;
    public AccountAddressKey(){}
    public AccountAddressKey(Integer idAddress, String idAccount) {
        this.idAddress = idAddress;
        this.idAccount = idAccount;
    }
    public Integer getIdAddress() {
        return idAddress;
    }
    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }
    public String getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }
}
