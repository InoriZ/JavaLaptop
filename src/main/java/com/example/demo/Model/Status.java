package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstatus")
    Integer idStatus;
    @Column(name = "statusname")
    String statusName;
    @Column(name = "isdelete")
    Boolean isDelete;

    @OneToMany(mappedBy = "status")
    List<Invoice> invoices = new ArrayList<>();

    public Status() {
    }

    public Status(String statusName, Boolean isDelete, List<Invoice> invoices) {
        this.statusName = statusName;
        this.isDelete = isDelete;
        this.invoices = invoices;
    }

    public Status(Integer idStatus, String statusName, Boolean isDelete, List<Invoice> invoices) {
        this.idStatus = idStatus;
        this.statusName = statusName;
        this.isDelete = isDelete;
        this.invoices = invoices;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    
    

}
