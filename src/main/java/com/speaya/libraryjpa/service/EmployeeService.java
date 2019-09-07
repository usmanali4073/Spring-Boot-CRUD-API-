package com.speaya.libraryjpa.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.speaya.libraryjpa.Entities.Employee;
import com.speaya.libraryjpa.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepo _employeeRepo;


    @Override
    public List<Employee> get() {

        return _employeeRepo.findAll();
    }

    @Override
    public Employee get(int id) {

        Employee employee = this._employeeRepo.getOne(id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return this._employeeRepo.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        this._employeeRepo.delete(employee);
    }

    public List<Employee> getByName(String Name) {
        List<Employee> employees = this._employeeRepo.findAll().stream()
                .filter(n -> n.getLastname().equalsIgnoreCase(Name))
                .collect(Collectors.toList());
        return  employees;
    }
}
