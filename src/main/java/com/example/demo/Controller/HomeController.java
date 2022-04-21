package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends BaseController{
    @RequestMapping("/nothing")
    public String Test(Model model){

        model.addAttribute("listProduct", Product.getProduct());
        return "test";
    }
    @RequestMapping("/ProductDetail")
String Error404 (Model model) {

   model.addAttribute("listProduct", Product.getProduct());

   return "/Product/ProductDetail";
}

}


