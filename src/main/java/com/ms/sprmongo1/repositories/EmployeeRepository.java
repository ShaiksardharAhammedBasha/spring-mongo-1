package com.ms.sprmongo1.repositories;

import com.ms.sprmongo1.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
