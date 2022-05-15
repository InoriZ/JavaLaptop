package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.Invoice;

import org.springframework.stereotype.Service;

@Service
public class InvoicesService extends BaseService {
    
    public List<Invoice> getAllInvoice(){
        var account = super.getCurrentAccount();
        List<Invoice> invoices = new ArrayList<>();
        for (var item : account.getAccountAddresses()) {
            invoices.addAll(item.getAddress().getInvoices());
        }
        return invoices;
    }


}
