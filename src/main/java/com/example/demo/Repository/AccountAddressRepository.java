package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Model.Account;
import com.example.demo.Model.AccountAddress;
import com.example.demo.Model.AccountAddressKey;
import com.example.demo.Model.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface AccountAddressRepository extends JpaRepository<AccountAddress,AccountAddressKey>{
    public AccountAddress findByAddress(Address address);
    public List<AccountAddress> findByAccountAndIsDefault(Account account, Boolean isDefault);
    public List<AccountAddress> findByAccount(Account account);

}
