package com.speaya.libraryjpa.repository;

import com.speaya.libraryjpa.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee ,Integer>{

}
