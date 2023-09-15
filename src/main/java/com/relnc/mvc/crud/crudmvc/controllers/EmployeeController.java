package com.relnc.mvc.crud.crudmvc.controllers;

import com.relnc.mvc.crud.crudmvc.entity.Employee;
import com.relnc.mvc.crud.crudmvc.services.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;

    }
    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        List<Employee> theEmployees = employeeService.findAll();

        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/showFormUpdate")
    public String showFormUpdate(@RequestParam("employeeId") int theId, Model theModel) {
        Employee theEmployee = employeeService.findById(theId);

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    @GetMapping("/showFormDelete")
    public String showFormDelete(@RequestParam("employeeId") int theId, Model theModel) {
        employeeService.deleteById(theId);

        return "redirect:/employees/list";
    }

}
