package net.corejava.demo_example.controller;

import net.corejava.demo_example.entity.Employee;
import net.corejava.demo_example.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController{
    @Autowired
    EmployeeServiceImpl employeeServiceimpl;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println("employee added successfully but there no get method is there that's why we are not getting response on postnman");
        Employee e=employeeServiceimpl.createEmployee(employee);
        return e;
    }

    @GetMapping("/all")
    public List<Employee> getEmployee(){
        return employeeServiceimpl.getEmployees();
    }

    @PatchMapping("/update")
    public Employee UpdateEmployee(@RequestBody Employee employee){
        return employeeServiceimpl.updateEmployees(employee);
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable long id){
        return employeeServiceimpl.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable long id){

         employeeServiceimpl.deleteById(id);
         return "Employee with "+id +" is deleted "+"successfully";
    }
    @GetMapping("/search/{name}")
    public List<Employee> search(@PathVariable String name){
        return employeeServiceimpl.searchByname(name);
    }


}