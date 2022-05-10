package com.example.demo.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table

public class Role implements Serializable{
    @Id
    @Column(name = "idrole")
    private UUID idRole;  
    @Column(name = "isdelete")  
    Boolean isDelete;
    @Column(name = "rolename")
    String roleName;
    @OneToMany(mappedBy = "IDAccount", cascade = CascadeType.ALL)
    List<Account> Accounts = new ArrayList<>();

    public Role(){}

    public Role(UUID idRole, Boolean isDelete, String roleName, List<Account> accounts) {
        this.idRole = idRole;
        this.isDelete = isDelete;
        this.roleName = roleName;
        Accounts = accounts;
    }

    public Role(UUID idRole, Boolean isDelete, String roleName) {
        this.idRole = idRole;
        this.isDelete = isDelete;
        this.roleName = roleName;
    }

    public UUID getIdRole() {
        return idRole;
    }

    public void setIdRole(UUID idRole) {
        this.idRole = idRole;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<Account> accounts) {
        Accounts = accounts;
    }
    
    



    
    
}
