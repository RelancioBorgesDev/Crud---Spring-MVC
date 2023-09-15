package com.relnc.mvc.crud.crudmvc.repositories;

import com.relnc.mvc.crud.crudmvc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
