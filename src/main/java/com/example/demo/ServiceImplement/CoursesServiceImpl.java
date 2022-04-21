package com.example.demo.ServiceImplement;

import java.util.List;

import com.example.demo.Model.Courses;
import com.example.demo.Repository.CoursesRepository;

import com.example.demo.Service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private  CoursesRepository coursesrepository;
    @Override
    public List<Courses> getallCourses() {
        return coursesrepository.findAll();
    }
    
}
