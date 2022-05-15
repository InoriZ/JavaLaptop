package com.example.demo.Model;




import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table
public class Account implements Serializable{
    
    @Column(name = "Idaccount")
    @Id
    
    String IDAccount;
    @Column(name = "Username")
    String user;
    
    @JsonIgnore
    byte[] password;
    
    String email;
    @Column(name = "Isdelete")
    Boolean IsDelete;
    @Column (name = "Fullname")
    String FullName;
    
    Boolean Gender;

    @ManyToOne
    @JoinColumn(name = "idrole")
    Role AccountRole;

    @OneToMany(mappedBy = "account")
    List<Cart> Carts = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    List<AccountAddress> accountAddresses = new ArrayList<>();


    


    public List<AccountAddress> getAccountAddresses() {
        return accountAddresses;
    }


    public void setAccountAddresses(List<AccountAddress> accountAddresses) {
        this.accountAddresses = accountAddresses;
    }


    public Account(String iDAccount, String user, byte[] password, String email, Boolean isDelete, String fullName,
            Boolean gender, Role accountRole, List<Cart> carts, List<AccountAddress> accountAddresses) {
        IDAccount = iDAccount;
        this.user = user;
        this.password = password;
        this.email = email;
        IsDelete = isDelete;
        FullName = fullName;
        Gender = gender;
        AccountRole = accountRole;
        Carts = carts;
        this.accountAddresses = accountAddresses;
    }


    public void setAccountRole(Role accountRole) {
        AccountRole = accountRole;
    }


    public List<Cart> getCarts() {
        return Carts;
    }


    public void setCarts(List<Cart> carts) {
        Carts = carts;
    }


    public Account(){}
    

    public Account(String iDAccount, String userName, byte[] password, String email) {
        IDAccount = iDAccount;
        user = userName;
        this.password = password;
        this.email = email;
    }


   

    public Account(String iDAccount, String user, byte[] password, String email, Role accountRole) {
        IDAccount = iDAccount;
        this.user = user;
        this.password = password;
        this.email = email;
        AccountRole = accountRole;
    }


  


    public Account(String iDAccount, String user, byte[] password, String email, Boolean isDelete, String fullName,
            Boolean gender, Role accountRole, List<Cart> carts) {
        IDAccount = iDAccount;
        this.user = user;
        this.password = password;
        this.email = email;
        IsDelete = isDelete;
        FullName = fullName;
        Gender = gender;
        AccountRole = accountRole;
        Carts = carts;
    }


    public String getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(String iDAccount) {
        IDAccount = iDAccount;
    }

    public String getUserName() {
        return user;
    }

    public void setUserName(String userName) {
        user = userName;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


    public Role getRole() {
        return this.AccountRole;
    }
    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public Role getAccountRole() {
        return AccountRole;
    }

    



    

}
