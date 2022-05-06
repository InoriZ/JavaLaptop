package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Helper.Helper;
import com.example.demo.Model.Account;
import com.example.demo.SideModel.ReturnJsonObject;
import com.example.demo.SideModel.SignUpModel;

import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseService{
    public Object AddAccount(SignUpModel model){
        
        var checkUser = Accounts.findByUser(model.getUser());
        var checkEmail = Accounts.findByEmail(model.getEmail());
        
        if (checkUser != null || checkEmail != null) {
            
            ReturnJsonObject result = new ReturnJsonObject(false, "Trùng Email hoặc UserName",null);

            return result;
        }
        var userRole = Roles.findByRoleName("User");
        var Idaccount =  Helper.RandomString(64);
        Account rs = new Account(Idaccount, model.getUser(), Helper.Hash(model.getPass()), model.getEmail(),userRole);
        
        Accounts.saveAndFlush(rs);
        ReturnJsonObject result = new ReturnJsonObject(true, "Đăng kí thành công","/");
        
        return result;
        
    }
    public Account findAccount(String user){
        return Accounts.findByUser(user);
    }
   
}
