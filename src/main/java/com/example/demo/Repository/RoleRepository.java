package com.example.demo.Repository;

import java.util.UUID;

import com.example.demo.Model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,UUID> {
    public Role findByRoleName(String Name);
}
