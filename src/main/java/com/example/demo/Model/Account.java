package com.example.demo.Model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Account {
    
    @Column(name = "Idaccount")
    @Id
    
    String IDAccount;
    @Column(name = "Username")
    String UserName;
    
    @JsonIgnore
    byte[] Password;
    
    String Email;

    String Token;
    @Column(name = "Expiredtokentime")
    Timestamp ExpTokenTime;
    @Column(name = "Isdelete")
    Boolean IsDelete;
    @Column (name = "Fullname")
    String FullName;
    
    Boolean Gender;

    public Account(){}
    

    public Account(String iDAccount, String userName, byte[] password, String email) {
        IDAccount = iDAccount;
        UserName = userName;
        Password = password;
        Email = email;
    }


    public Account(String iDAccount, String userName, byte[] password, String email, String token, Timestamp expTokenTIme,
            Boolean isDelete, String fullName, Boolean gender) {
        IDAccount = iDAccount;
        UserName = userName;
        Password = password;
        Email = email;
        Token = token;
        ExpTokenTime = expTokenTIme;
        IsDelete = isDelete;
        FullName = fullName;
        Gender = gender;
    }

    public String getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(String iDAccount) {
        IDAccount = iDAccount;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public byte[] getPassword() {
        return Password;
    }

    public void setPassword(byte[] password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public Timestamp getExpTokenTIme() {
        return ExpTokenTime;
    }

    public void setExpTokenTIme(Timestamp expTokenTIme) {
        ExpTokenTime = expTokenTIme;
    }

    public Boolean getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        IsDelete = isDelete;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean gender) {
        Gender = gender;
    }

    



    

}
