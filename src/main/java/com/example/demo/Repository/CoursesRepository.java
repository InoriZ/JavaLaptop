package com.example.demo.Repository;

import com.example.demo.Model.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository  extends JpaRepository<Courses ,Integer >{
    
}
