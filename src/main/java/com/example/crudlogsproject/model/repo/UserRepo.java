package com.example.crudlogsproject.model.repo;

import com.example.crudlogsproject.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer > {
}
