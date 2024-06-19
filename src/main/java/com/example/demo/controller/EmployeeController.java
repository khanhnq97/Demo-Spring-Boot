package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employees;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // add employee
    @PostMapping
    public void addEmployee(@RequestBody EmployeeDto employee) {
        employeeService.addEmployee(employee);
    }

    // delete employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
    }

    //get employee by id
    @GetMapping("/{id}")
    public Employees getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    // get all employees
    @GetMapping
    public List<Employees> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
