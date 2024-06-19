package com.example.demo.services;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employees;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employees getEmployeeById(int id) {
        return employeeRepository.findById(String.valueOf(id)).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void addEmployee(EmployeeDto employee) {
        Employees employeeEntity = new Employees();
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        employeeEntity.setHourlyPay(employee.getHourlyPay());
        employeeEntity.setHireDate(employee.getHireDate());
        employeeEntity.setPhoneNumber(employee.getPhoneNumber());

        employeeRepository.save(employeeEntity);
    }

    // delete employee
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(String.valueOf(id));
    }

    // update employee
    public void updateEmployee(Employees employee) {
        employeeRepository.save(employee);
    }
}
