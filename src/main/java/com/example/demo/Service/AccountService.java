package com.example.demo.Service;

import java.util.Arrays;

import com.example.demo.Helper.Helper;
import com.example.demo.Model.Account;
import com.example.demo.SideModel.EmailService;
import com.example.demo.SideModel.ReturnJsonObject;
import com.example.demo.SideModel.SignUpModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseService {
    @Autowired
    EmailService emailSender;

    public Object AddAccount(SignUpModel model) {

        var checkUser = Accounts.findByUser(model.getUser());
        var checkEmail = Accounts.findByEmail(model.getEmail());

        if (checkUser != null || checkEmail != null) {

            ReturnJsonObject result = new ReturnJsonObject(false, "Trùng Email hoặc UserName", null);

            return result;
        }
        var userRole = Roles.findByRoleName("User");
        var Idaccount = Helper.RandomString(64);
        Account rs = new Account(Idaccount, model.getUser(), Helper.Hash(model.getPass()), model.getEmail(), userRole);

        Accounts.saveAndFlush(rs);
        ReturnJsonObject result = new ReturnJsonObject(true, "Đăng kí thành công", "/");

        return result;

    }

    public Account findAccount(String user) {
        return Accounts.findByUser(user);
    }

    public Object changePassword(String current, String newPass) {
        var Account = super.getCurrentAccount();
        var checkPass = Arrays.equals(Account.getPassword(), Helper.Hash(current));
        if (checkPass) {
            Account.setPassword(Helper.Hash(newPass));
            Accounts.saveAndFlush(Account);
            return new ReturnJsonObject(checkPass, "Đổi mật khẩu thành công", "");

        }
        return new ReturnJsonObject(checkPass, "Mật khẩu cũ không đúng", "");
    }

    public Object forgotPassword(String email) {
        var acc = Accounts.findByEmail(email);
        if(acc == null){
            return new ReturnJsonObject(false, "Không có tài khoản tương ứng", "url");
        }
        var newPass = Helper.RandomString(12);
        acc.setPassword(Helper.Hash(newPass));
        Accounts.save(acc);
        emailSender.sendSimpleMessage(email, "Đổi mật khẩu của TeyVat Laptop", "Xin chào, mật khẩu mới của bạn là:" + newPass);
        
        return new ReturnJsonObject(true, "Mật khẩu mới đã được gửi tới email của bạns", "url");


    }

}
