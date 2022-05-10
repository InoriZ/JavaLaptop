package com.example.demo.Controller;


import com.example.demo.SideModel.ReturnJsonObject;
import com.example.demo.SideModel.SignUpModel;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "/Account/SignAndLog";
        }
 
        return "redirect:/";
    
        
    }

    @PostMapping("/Register")
    @ResponseBody
    public Object SignUp(SignUpModel model){
        
        var obj = Accounts.AddAccount(model);

        return obj;
    }
    @ResponseBody
    @RequestMapping("/LogSuccess")
    public Object LogSuccess(){
        return new ReturnJsonObject(true, "Đăng nhập thành công, bạn sẽ quay về trang chủ", "/");
    }
    @ResponseBody
    @RequestMapping("/FailureLog")
    public Object FailureLog(){
        
        return new ReturnJsonObject(false, "Đăng nhập thất bại, sai tài khoản hoặc mật khẩu", null);
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
    @RequestMapping("/Account/Cart")
   String Cart (Model model) {

      model.addAttribute("message", "some thing from controller");

      return "/Account/Cart";
    }
}
