package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class OhayouGozaimasu {
	@GetMapping
    String getPeople(Model model){
        model.addAttribute("something","some thing from controller");
        return "SignAndLog";
    }

}
