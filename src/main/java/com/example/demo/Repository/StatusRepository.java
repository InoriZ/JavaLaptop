package com.example.demo.Repository;



import com.example.demo.Model.Status;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface StatusRepository extends JpaRepository<Status,Integer> {
    
}
