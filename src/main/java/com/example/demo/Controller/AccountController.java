package com.example.demo.Controller;

import com.example.demo.Helper.Helper;
import com.example.demo.Model.Account;

import com.example.demo.SideModel.ReturnJsonObject;
import com.example.demo.SideModel.SignUpModel;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AccountController extends BaseController{
	@RequestMapping("/SignAndLog")
    String getPeople(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Account/SignAndLog";
    }

    @PostMapping("/Register")
    @ResponseBody
    public Object SignUp(SignUpModel model){
        var Idaccount =  Helper.RandomString(64);
        Account rs = new Account(Idaccount, model.getUser(), Helper.Hash(Idaccount+model.getPass()), model.getEmail());
        Accounts.AddAccount(rs);
        return new ReturnJsonObject(true, rs);

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
