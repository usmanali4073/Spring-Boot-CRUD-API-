package com.speaya.libraryjpa.repository;

import com.speaya.libraryjpa.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepo extends JpaRepository<Department, Integer> {
}
