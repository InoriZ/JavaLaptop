package com.example.demo.Model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productattribute")

public class ProductAttribute implements Serializable {
    @EmbeddedId
    ProductAttributeKey id;

    @OneToOne
    @MapsId("IdProduct")
    @JoinColumn(name = "idproduct")
    Product product;

    @OneToOne
    @MapsId("IdAtribute")
    @JoinColumn(name = "idattribute")
    Attribute attribute;

    @Column(name = "Attributevalue")
    String Value;

    public ProductAttributeKey getId() {
        return id;
    }

    public void setId(ProductAttributeKey id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
