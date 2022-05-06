package com.example.demo.Service;

import com.example.demo.Model.Attribute;
import com.example.demo.Repository.AttributeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Attribute getAttributebyid (int id){
        Optional <Attribute> optional = Attributes.findById(id);
        Attribute attribute = null;
        if(optional.isPresent()){
            attribute = optional.get();
        }else {
            throw new RuntimeException("Attribute not found for id::" + id);
        }
        return attribute;
    }
    
}
