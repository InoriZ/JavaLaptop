package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.AccountAddress;
import com.example.demo.Model.Address;
import com.example.demo.SideModel.ReturnJsonObject;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;



@Service
public class AddressService extends BaseService {
    public void Test(){
        var check = AccountAddress.count();
    }
    public List<AccountAddress> GetListAddress(){
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        // var ListAddress = new ArrayList<Address>();
        // for (var item : account.getAccountAddresses()) {
        //     ListAddress.add(item.getAddress());
        // }
        return account.getAccountAddresses();
    }

    public ReturnJsonObject AddAddress(String address, String phone, String receiver){
        var newAddress = new Address(address, phone, receiver);
        Address.save(newAddress);
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        Boolean isDefault = true;
        for (var item : account.getAccountAddresses()) {
            if(item.getIsDefault() == true){
                isDefault = false;
                break;
            }
        }
        var accountAddresses = new AccountAddress(account, newAddress, isDefault);
        AccountAddress.save(accountAddresses);
        return new ReturnJsonObject(true, "result", "/Account/Address");
        
    }
    public ReturnJsonObject ChangeDF(Integer id){
        var address = Address.getById(id);
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        var accountAddressesList = account.getAccountAddresses();
        for (AccountAddress accountAddress : accountAddressesList) {
            if (accountAddress.getAddress() == address) {
                accountAddress.setIsDefault(true);
            }
            else{
                accountAddress.setIsDefault(false);
            }
        }
        AccountAddress.saveAll(accountAddressesList);
        return new ReturnJsonObject(true, "result", "");

    }
    public Address GetDFAddress() {
        var accountName = SecurityContextHolder.getContext().getAuthentication().getName();
        var account = Accounts.findByUser(accountName);
        for (var item : account.getAccountAddresses()) {
            if (item.getIsDefault() == true) {
                return item.getAddress();
            }
        }
        return null;
    }
}
