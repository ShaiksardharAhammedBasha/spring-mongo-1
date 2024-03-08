package com.ms.sprmongo1.controllers;

import com.ms.sprmongo1.models.Employee;
import com.ms.sprmongo1.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "com.syn/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository mongoRepository;

    @PostMapping(value = "/save")
    public Object saveEmployeeData(@RequestBody Employee employee) {
        return mongoRepository.save(employee);
    }

    @GetMapping(value = "/")
    public List<Employee> findAllEmployees() {
        return mongoRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Employee findByIdEmployees(@PathVariable("id") int id) {
        return mongoRepository.findById(id).get();
    }

    @GetMapping(value = "/{id}}")
    public Employee findAllEmployee(@PathVariable("id") int id) {
        return mongoRepository.findById(id).get();
    }

    @GetMapping(value = "/{id}}")
    public Employee findAllEmployee2(@PathVariable("id") int id) {
        return mongoRepository.findById(id).get();
    }

    public void deleteById(@PathVariable("id") int id) {
        mongoRepository.deleteById(id);
    }

    public void deleteById2(@PathVariable("id") int id) {
        mongoRepository.deleteById(id);
    }

}
