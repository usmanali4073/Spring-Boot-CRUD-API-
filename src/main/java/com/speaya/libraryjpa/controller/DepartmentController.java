package com.speaya.libraryjpa.controller;

import com.speaya.libraryjpa.Entities.Department;
import com.speaya.libraryjpa.Entities.Employee;
import com.speaya.libraryjpa.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private IDepartmentService _departmentService;

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(this._departmentService.Get());
    }

    @GetMapping("{id}")
    public ResponseEntity get(@PathVariable int id) {
        Department dpt = this._departmentService.Get(id);
        if (dpt != null) {
            return ResponseEntity.ok(dpt);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity Add(@RequestBody Department department) {

      Department  dpt=  this._departmentService.Add(department);
      if (dpt != null){
         return ResponseEntity.ok(dpt);
      }
      return  ResponseEntity.badRequest().build();
    }
}
