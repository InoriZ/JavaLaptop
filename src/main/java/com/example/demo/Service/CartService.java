package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.example.demo.Model.Cart;
import com.example.demo.Model.ProductCart;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class CartService extends BaseService {
    public void test() {
        // // var AccountUser =
        // // SecurityContextHolder.getContext().getAuthentication().getName();

        // var Check = new
        // ProductCart(Carts.getById(UUID.fromString("7db289f6-a2c9-684c-b360-bf31b20bd935")),
        // Products.getById(2), 3);
        // ProductCarts.save(Check);

        return;

    }

    public String AddCart(Integer idProduct) {
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        var cart = Carts.getByAccountAndIsExpired(account, false);
        if (cart == null) {
            cart = new Cart(UUID.randomUUID(), false, account);
            Carts.save(cart);
        }
        var product = Products.getById(idProduct);
        var ProductCart = new ProductCart(cart, product, 1);
        ProductCarts.save(ProductCart);
        return "Thêm vào giỏ hành thành công";
    }

    public String AddCart(Integer idProduct, Integer quantity) {
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        var cart = Carts.getByAccountAndIsExpired(account, false);
        if (cart == null) {
            cart = new Cart(UUID.randomUUID(), false, account);
            Carts.save(cart);
        }
        var product = Products.getById(idProduct);
        var ProductCart = new ProductCart(cart, product, quantity);
        ProductCarts.save(ProductCart);
        return "Thêm vào giỏ hành thành công";
    }
    public Cart GetCart(){
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        var rs = new Cart();
        for (var item : account.getCarts()) {
            if (item.getIsExpired() == false) {
                rs = item;
                break;
            }
        }
        return rs;
    }
}
