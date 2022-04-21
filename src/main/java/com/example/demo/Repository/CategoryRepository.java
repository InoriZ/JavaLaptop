package com.example.demo.Repository;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer > {

}
