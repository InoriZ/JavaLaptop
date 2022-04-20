package com.example.demo.Controller;

import com.example.demo.Model.Courses;
import com.example.demo.Service.CoursesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CoursesController {
    @Autowired
    private CoursesService coursesservice;
    @GetMapping("/OhayouGozaimasu/test")
    public String viewHomePage(Model model){
        Courses test = new Courses();
        test.setId(1);
        test.setLecturerId("1");
        test.setPlace("just a test");
        model.addAttribute("listCourses",test);
        return "test";
    }
}
