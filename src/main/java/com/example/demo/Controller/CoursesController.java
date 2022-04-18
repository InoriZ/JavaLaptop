package com.example.demo.Controller;

import com.example.demo.Service.CoursesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CoursesController {
    @Autowired
    private CoursesService coursesservice;
    @GetMapping
    public String viewHomePage(Model model){
        model.addAttribute("listCourses",coursesservice.getallCourses());
        return "people";
    }
}
