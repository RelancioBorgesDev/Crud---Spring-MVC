package com.relnc.mvc.crud.crudmvc.controllers;

import com.relnc.mvc.crud.crudmvc.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> theEmployees;


}
