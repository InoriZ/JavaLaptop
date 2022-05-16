package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.Model.Invoice;
import com.example.demo.Model.Status;

import org.springframework.stereotype.Service;

@Service
public class InvoicesService extends BaseService {
    
    public List<Invoice> getAllAccountInvoice(){
        var account = super.getCurrentAccount();
        List<Invoice> invoices = new ArrayList<>();
        for (var item : account.getAccountAddresses()) {
            invoices.addAll(item.getAddress().getInvoices());
        }
        return invoices;
    }
    public Invoice getById(UUID id){
        return Invoices.getById(id);
    }
    public List<Invoice> getAllInvoice(){
        return Invoices.findAll();
    }
    public List<Status> getAllStatus(){
        return Status.findAll();
    }


}
