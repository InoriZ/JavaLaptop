package com.example.demo.Controller;

import com.example.demo.SideModel.ReturnJsonObject;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CartController extends BaseController {
    
    @PostMapping("/Cart/AddToCart")
    @ResponseBody
    public Object postMethodName(Integer idProduct) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return new ReturnJsonObject(false, "Vui lòng đăng nhập trước.", "/SignAndLog");

        }
        var rs = Carts.AddCart(idProduct);
        
        return new ReturnJsonObject(true, rs, "/");
 
    }
    @PostMapping("/Cart/AddManyToCart")
    @ResponseBody
    public Object postMethodName(Integer idProduct,Integer quantity) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return new ReturnJsonObject(false, "Vui lòng đăng nhập trước.", "/SignAndLog");

        }
        var rs = Carts.AddCart(idProduct,quantity);
        
        return new ReturnJsonObject(true, rs, "/");
 
    }
}
