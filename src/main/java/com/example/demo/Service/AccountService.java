package com.example.demo.Service;

import com.example.demo.Model.Account;

import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseService{
    public void AddAccount(Account model){
        Accounts.saveAndFlush(model);
        
    }
}
