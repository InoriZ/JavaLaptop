package com.example.demo.Model;


import javax.persistence.*;

@Entity
@Table
public class Attribute {
    public int getIDAtribute() {
        return IDAtribute;
    }
    public void setIDAtribute(int iDAtribute) {
        IDAtribute = iDAtribute;
    }
    public String getAttributeName() {
        return AttributeName;
    }
    public void setAttributeName(String attributeName) {
        AttributeName = attributeName;
    }
    public Boolean getIsDelete() {
        return IsDelete;
    }
    public void setIsDelete(Boolean isDelete) {
        IsDelete = isDelete;
    }
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="IDAtribute")
    int IDAtribute;
    String AttributeName;
    Boolean IsDelete;
}
