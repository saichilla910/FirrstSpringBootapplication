package net.corejava.demo_example.services;

import net.corejava.demo_example.Repository.EmployeeRepository;
import net.corejava.demo_example.entity.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Constructor injection
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;

        System.out.println("EmployeeServiceImpl constructor is called");
    }

    @Override
    public Employee createEmployee(Employee employee) {

        Employee savedEmployee = employeeRepository.save(employee);

        return savedEmployee;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployees(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);

        return savedEmployee;
    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    public void deleteById(long id) {
         employeeRepository.deleteById(id);
    }

    public List<Employee> searchByname(String name) {
        return employeeRepository.searchByName(name);
    }
}