package com.relnc.mvc.crud.crudmvc.repositories;

import com.relnc.mvc.crud.crudmvc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
