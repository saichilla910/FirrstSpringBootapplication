package net.corejava.demo_example.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class EmployeeRepoData {

    private final List<String> employees = new ArrayList<>();
    private final List<Integer> numbers=new ArrayList<>();


    public EmployeeRepoData() {
        employees.add("Sai");
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amulya");
        numbers.add(1);
        numbers.add(2);
    }

    public List<String> getAllEmployees() {
        return employees;
    }

    public void addEmployee(String employee) {
        employees.add(employee);
    }

    public List<Integer> GetAllNumbers(){
        return numbers;
    }

}