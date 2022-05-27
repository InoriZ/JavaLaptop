package com.example.demo.Controller;



import com.example.demo.Model.Product;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




// import groovyjarjarantlr4.v4.parse.ANTLRParser.id_return;

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

        // var test2 = Accounts.findAccount("rio123");
        // System.out.println("test 1 chutsssssssss:" +test2.getRole().getRoleName());

        Product test = Products.getProduct();
        // System.out.println(test.getName());



        model.addAttribute("listCourses", test);

        return "test";
    }
    @RequestMapping("/ProductDetail/{id}")
    String ProductDetail (@PathVariable Integer id, Model model) {
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        model.addAttribute("listProduct", Products.getProductDetail(id));
       
        return "/Product/ProductDetail";
        
       
    }

    @RequestMapping("/")
    String Index (Model model) {

        model.addAttribute("listProduct1", Products.getProductByCategory(1).subList(0, 4));
       
        model.addAttribute("listProduct2", Products.getProductByCategory(5).subList(0, 4));
        model.addAttribute("listProduct3", Products.getProductByCategory(3).subList(0, 4));

        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Home/Index";
    }

    @RequestMapping("/ProductbyCate/{id}")
    String ProductbyCate (@PathVariable Integer id, Model model) {

        model.addAttribute("pdCate", Products.getProductByCategory(id));
       
        model.addAttribute("listCategoryHome", Categories.GetAllCategory());
        return "/Home/ProductbyCate";
    }

    @GetMapping(value="/Search")
    public String search(String search,Model model) {
        
        model.addAttribute("pdCate", Products.getProductByName(search));
        return "/Home/Search";
    }
    

    
}
