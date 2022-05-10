package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import com.example.demo.Model.Account;
import com.example.demo.Model.Cart;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CartRepository extends JpaRepository<Cart,UUID>{
    public List<Cart> findByAccount(Account account);
    public Cart  getByAccountAndIsExpired(Account account,Boolean isExpired);
}
