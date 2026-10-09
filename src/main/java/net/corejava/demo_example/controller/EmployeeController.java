package net.corejava.demo_example.controller;

import net.corejava.demo_example.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<String> getEmployees() {
        return employeeService.getAllEmployees();
    }
    @PostMapping
    public String addEmployee(@RequestParam String name) {
        employeeService.addEmployee(name);
        return "Employee added successfully";
    }
    @GetMapping("/numbers")
    public List<Integer> getAllNumbers(){
        return employeeService.getAllNumbers();
    }
}