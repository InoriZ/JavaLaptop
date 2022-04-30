package com.example.demo.SideModel;

import com.example.demo.Model.Account;
import com.example.demo.Repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomDetailService implements UserDetailsService {

    @Autowired
    AccountRepository AccountRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = AccountRepo.findByUser(username);
        if(user == null)
            throw new UsernameNotFoundException("User not fount");
        return new CustomDetail(user);
    }
    
}
