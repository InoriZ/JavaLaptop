package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class OhayouGozaimasu {
	@RequestMapping("/SignAndLog")
    String getPeople(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Auth/SignAndLog";
    }

    @RequestMapping("/ForgetPassword")
     String index(Model model) {

		model.addAttribute("message", "some thing from controller");
		return "/Auth/ForgetPassword";
	}
    @RequestMapping("/Admin")
     String admin(Model model) {

		model.addAttribute("message", "some thing from controller");
		return "/layout/_layoutAdmin";
	}
}
