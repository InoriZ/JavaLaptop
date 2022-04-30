package com.example.demo.Model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Account {
    
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
            Boolean gender, Role accountRole) {
        IDAccount = iDAccount;
        this.user = user;
        this.password = password;
        this.email = email;
        IsDelete = isDelete;
        FullName = fullName;
        Gender = gender;
        AccountRole = accountRole;
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

    



    

}
