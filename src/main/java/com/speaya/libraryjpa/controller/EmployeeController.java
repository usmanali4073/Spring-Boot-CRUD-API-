package com.speaya.libraryjpa.controller;

import com.speaya.libraryjpa.Entities.Employee;
import com.speaya.libraryjpa.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    IEmployeeService _employeeService;

    @GetMapping
    public List<Employee> Get() {
        return this._employeeService.get();
    }

    @GetMapping("{id}")
    public ResponseEntity Get(@PathVariable int id) {
        Employee emp = this._employeeService.get(id);
        if (emp != null) {
            return ResponseEntity.ok(emp);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("{name}")

    public ResponseEntity GetByName(@RequestParam String name) {
        return  ResponseEntity.ok(this._employeeService.getByName(name));
    }

    @PostMapping
    public ResponseEntity Add(@RequestBody Employee employee) {
        Employee emp = this._employeeService.save(employee);
        if (emp != null) {
            return ResponseEntity.ok(emp);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("{id}")
    public ResponseEntity Delete(@PathVariable int id) {
        Employee employee = this._employeeService.get(id);
        if (employee != null) {
            this._employeeService.delete(employee);
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);

    }


}
