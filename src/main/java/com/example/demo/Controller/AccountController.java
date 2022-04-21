package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class AccountController {
	@RequestMapping("/SignAndLog")
    String getPeople(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Account/SignAndLog";
    }

    @RequestMapping("/ForgetPassword")
     String index(Model model) {

		model.addAttribute("message", "some thing from controller");

		return "/Account/ForgetPassword";
	}

    @RequestMapping("/Layout")
    String test(Model model) {

       model.addAttribute("message", "some thing from controller");

       return "test";
   }

   

   @RequestMapping("/ChangePassword")
    String ChangePassword(Model model) {

       model.addAttribute("message", "some thing from controller");

       return "/Account/ChangePassword";
   }

   @RequestMapping("/Notfound")
   String Error404 (Model model) {

      model.addAttribute("message", "some thing from controller");

      return "/Account/ERROR404";
  }
}
