package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController extends BaseController{
    @RequestMapping("/Admin/Product")
    String product(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Admin/Product";
    }
    @RequestMapping("/Admin/Attribute")
    String attribute(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Admin/Attribute";
    }

    @RequestMapping("/Admin/Category")
    public String category(Model model){
        model.addAttribute("listCategory", Categories.GetAllCategory());
        return "/Admin/Category";
    }
    @RequestMapping("/Admin/InvoiceDetail")
    String invoice(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Admin/InvoiceDetail";
    }
}
