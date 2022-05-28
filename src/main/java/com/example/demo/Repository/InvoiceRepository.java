package com.example.demo.Repository;

import java.util.UUID;

import com.example.demo.Model.Cart;
import com.example.demo.Model.Invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,UUID>{
    public Invoice getByCart(Cart cart);
}
