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
    

}
