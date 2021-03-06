package com.example.demo.Repository;


import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer > {
    List<Product> findByCategory(Category category);
    // List<Product> findByProduct(Product product); 
    @Query(value = "select * from product e where e.name like %:name%", nativeQuery = true)
    List<Product> findByNameIsContaining(@Param("name") String name);
}

