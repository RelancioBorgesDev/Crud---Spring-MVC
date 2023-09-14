package com.relnc.mvc.crud.crudmvc.services;

import com.relnc.mvc.crud.crudmvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
