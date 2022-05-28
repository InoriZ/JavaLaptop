package com.example.demo.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idattribute")
    int id;
    @Column(name = "attributename")
    String attributeName;
   

    @Column(name = "isdelete")
    Boolean isDelete;
    @JsonIgnore
    @OneToMany(mappedBy = "attribute",cascade = CascadeType.ALL)
    List<ProductAttribute> productAttributes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
