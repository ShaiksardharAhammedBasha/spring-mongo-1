package com.ms.sprmongo1.controllers;

import com.ms.sprmongo1.models.Employee;
import com.ms.sprmongo1.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "com.syn/v2")
public class Employee1Controller {


    @Autowired
    private EmployeeRepository mongoRepository;

    @PostMapping(value = "/save")
    public Object saveEmployee1Data(@RequestBody Employee employee) {
        return mongoRepository.save(employee);
    }

    @GetMapping(value = "/")
    public List<Employee> findAllEmployees1() {
        return mongoRepository.findAll();
    }
}
