package com.example.demo.Model;
// import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="lecturerid")
    private String LecturerId;
    @Column(name="place")
    private String Place ;
   
    // private int CategoryID;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLecturerId() {
        return LecturerId;
    }
    public void setLecturerId(String lecturerId) {
        LecturerId = lecturerId;
    }
    public String getPlace() {
        return Place;
    }
    public void setPlace(String place) {
        Place = place;
    }
  
    // public int getCategoryID() {
    //     return CategoryID;
    // }
    // public void setCategoryID(int categoryID) {
    //     CategoryID = categoryID;
    // }
    
}
