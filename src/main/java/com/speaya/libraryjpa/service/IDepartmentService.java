package com.speaya.libraryjpa.service;

import com.speaya.libraryjpa.Entities.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> Get();

    Department Get(int id);

    Department Add(Department department);

    void Delete(Department department);
}
