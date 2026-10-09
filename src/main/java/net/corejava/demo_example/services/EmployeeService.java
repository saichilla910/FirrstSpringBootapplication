package net.corejava.demo_example.services;

import net.corejava.demo_example.Repository.EmployeeRepoData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepoData employeeRepoData;

    public EmployeeService(EmployeeRepoData employeeRepoData) {
        this.employeeRepoData = employeeRepoData;
    }

    public List<String> getAllEmployees() {
        return employeeRepoData.getAllEmployees();
    }
    public void addEmployee(String employee) {
        employeeRepoData.addEmployee(employee);
    }
    public List<Integer> getAllNumbers(){
        return employeeRepoData.GetAllNumbers();
    }
}