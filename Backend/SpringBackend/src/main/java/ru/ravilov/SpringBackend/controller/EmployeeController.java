package ru.ravilov.SpringBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ravilov.SpringBackend.model.Employee;
import ru.ravilov.SpringBackend.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
