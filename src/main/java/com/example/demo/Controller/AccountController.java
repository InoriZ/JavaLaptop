package com.example.demo.Controller;

import com.example.demo.Model.Address;
import com.example.demo.Model.Account;
import com.example.demo.SideModel.ReturnJsonObject;
import com.example.demo.SideModel.SignUpModel;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
     String ForgetPassword(Model model) {

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

      model.addAttribute("cart", Carts.GetCart());
      model.addAttribute("address", Address.GetDFAddress());


      return "/Account/Cart";
    }
    @GetMapping("/Account/Address")
    String Address(Model model){
        model.addAttribute("listAddress", Address.GetListAddress());
        return "/Account/Address";
    }
    @GetMapping("/Account/AddAddress")
    String AddAddress(){
        return "/Account/AddAddress";
    }
    @PostMapping("/Account/AddAddress")
    @ResponseBody
    Object AddAddress(String address, String phone, String receiver){
        
        var rs = Address.AddAddress(address, phone, receiver);
        return rs;
    }
    @PostMapping("/Account/ChangeDFAddress")
    @ResponseBody
    Object ChangeDF(Integer id){
        
        return Address.ChangeDF(id);
    }
    @RequestMapping("/Account/Index")
   String index (Model model) {

      model.addAttribute("message", "some thing from controller");
      var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
      model.addAttribute("accounts", Accounts.findAccount(accountName));
      return "/Account/Index";
    }
}
