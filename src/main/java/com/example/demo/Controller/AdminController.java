package com.example.demo.Controller;


import com.example.demo.Model.Category;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController extends BaseController{
    @RequestMapping("/Admin/Product")
    String product(Model model){
        model.addAttribute("listProduct",Products.getAllProduct());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Product";
    }
    @RequestMapping("/Admin/Attribute")
    String attribute(Model model){
        model.addAttribute("listAttribute", Attributes.getAllAttribute());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Attribute";
    }

    @RequestMapping("/Admin/Category")
    public String category(Model model){
        model.addAttribute("listCategory", Categories.GetAllCategory());
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/Category";
    }
    @RequestMapping("/Admin/InvoiceDetail")
    String invoice(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/InvoiceDetail";
    }
    @RequestMapping("/Admin/AddCategory")
    String addCategory(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        Category category=new Category();
        model.addAttribute("category", category);
        return "/Admin/addCategory";
    }
    @PostMapping(value="/SaveCategory")
    public String SaveCategory(@ModelAttribute("category")  Category category) {
        //TODO: process POST request
        Categories.SaveCategory(category);
        return "redirect:/Admin/Category";
    }
    @RequestMapping("/Admin/EditCategory")
    String editCategory(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/editCategory";
    }
    @RequestMapping("/Admin/AddAttribute")
    String addAttribute(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/addAttribute";
    }
    @RequestMapping("/Admin/EditAttribute")
    String editAttribute(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/EditAttribute";
    }
    @RequestMapping("/Admin/AddProduct")
    String addProduct(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/AddProduct";
    }
    @RequestMapping("/Admin/EditProduct")
    String editProduct(Model model){
        model.addAttribute("something","some thing from controller");
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Admin/EditProduct";
    }
}
