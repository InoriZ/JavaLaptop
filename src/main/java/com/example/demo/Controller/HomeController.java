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
//        System.out.println(Products.getProduct().getName());
//
//        model.addAttribute("listCourses", Products.getProduct());
//        model.addAttribute("listCourses", Categories.getACategory(1));
//        for (Product item:
//                Products.getProductByCategory(2)) {
//            for (ProductAttribute item2:
//                 item.getProductAttributes()) {
//                            System.out.println(item2.getValue());
//
//            }

//        }
        Product test = Products.getProduct();
        System.out.println(test.getName());


        model.addAttribute("listCourses", test);

        return "test";
    }
@RequestMapping("/ProductDetail")
String Error404 (Model model) {

   model.addAttribute("listProduct", Product.getProduct());

   return "/Product/ProductDetail";
}
