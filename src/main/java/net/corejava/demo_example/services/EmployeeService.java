package net.corejava.demo_example.services;

import net.corejava.demo_example.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    List<Employee> getEmployees();
    public Employee updateEmployees(Employee employee);
    public Optional<Employee> getEmployeeById(long id);
    public void deleteById(long id);
    public List<Employee> searchByname(String name);

}