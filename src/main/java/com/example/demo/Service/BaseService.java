package com.example.demo.Service;

import com.example.demo.Model.Account;
import com.example.demo.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

public class BaseService {
    @Autowired
    protected AttributeRepository Attributes;
    @Autowired
    protected CategoryRepository Categories;

    @Autowired
    protected ProductRepository Products;
    @Autowired
    protected AccountRepository Accounts;
    @Autowired
    protected RoleRepository Roles;

    @Autowired
    protected CartRepository Carts;

    @Autowired
    protected ProductCartRepository ProductCarts;


    @Autowired 
    protected ProductAttributeRepository ProductAttr;

    @Autowired
    protected AddressRepository Address;

    @Autowired
    protected AccountAddressRepository AccountAddress;

    @Autowired 
    protected InvoiceRepository Invoices;

    @Autowired
    protected StatusRepository Status;

    protected Account getCurrentAccount(){
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        return account;
    }

}
