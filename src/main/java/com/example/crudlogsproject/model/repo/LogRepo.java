package com.example.crudlogsproject.model.repo;

import com.example.crudlogsproject.model.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepo extends JpaRepository<Logs, Integer> {
}
