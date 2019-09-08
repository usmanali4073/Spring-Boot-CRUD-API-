package com.speaya.libraryjpa.service;

import com.speaya.libraryjpa.Entities.Department;
import com.speaya.libraryjpa.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepo _departmentRepo;


    @Override
    public List<Department> Get() {
        return this._departmentRepo.findAll();
    }

    @Override
    public Department Get(int id) {
        return this._departmentRepo.getOne(id);
    }

    @Override
    public Department Add(Department department) {
        return this._departmentRepo.save(department);
    }

    @Override
    public void Delete(Department department) {
        this._departmentRepo.delete(department);
    }
}
