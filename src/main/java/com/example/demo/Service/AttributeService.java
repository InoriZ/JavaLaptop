package com.example.demo.Service;

import com.example.demo.Model.Attribute;
import com.example.demo.Repository.AttributeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeService {
    @Autowired
    AttributeRepository Attributes;
    public Attribute getAAttribute(int id){return Attributes.getById(id);}
    public List<Attribute> getAllAttribute(){return Attributes.findAll();}
    public void SaveAttribute(Attribute attribute)
    {
        this.Attributes.save(attribute);
    }
}
