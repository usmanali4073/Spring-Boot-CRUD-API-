package com.speaya.libraryjpa.service;


import com.speaya.libraryjpa.Entities.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> get();

    public Employee get(int id);

    public List<Employee> getByName(String Name);

    public Employee save(Employee employee);

    public void delete(Employee employee);
}
