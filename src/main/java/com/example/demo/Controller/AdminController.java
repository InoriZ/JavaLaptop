package com.example.demo.Controller;

import com.example.demo.Service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
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
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/Admin/Category")
    public String category(Model model){
        model.addAttribute("listCategory", categoryService.getallCategories());
        return "/Admin/Category";
    }
    @RequestMapping("/Admin/InvoiceDetail")
    String invoice(Model model){
        model.addAttribute("something","some thing from controller");
        return "/Admin/InvoiceDetail";
    }
}
