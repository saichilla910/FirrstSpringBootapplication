package net.corejava.demo_example;

import net.corejava.demo_example.entity.Employee;
import net.corejava.demo_example.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void testEmployeeCrudOperations() {
        // Create
        Employee employee = new Employee("John Doe", "john.doe@example.com", "IT");
        Employee saved = employeeService.createEmployee(employee);
        assertNotNull(saved.getId());
        assertEquals("John Doe", saved.getName());
        assertEquals("john.doe@example.com", saved.getEmail());
        assertEquals("IT", saved.getDepartment());

        // Get by ID
        Employee found = employeeService.getEmployeeById(saved.getId());
        assertEquals("John Doe", found.getName());

        // Get all
        List<Employee> all = employeeService.getAllEmployees();
        assertFalse(all.isEmpty());

        // Update
        found.setName("John Updated");
        Employee updated = employeeService.updateEmployee(found.getId(), found);
        assertEquals("John Updated", updated.getName());

        // Delete
        employeeService.deleteEmployee(updated.getId());
        assertThrows(ResponseStatusException.class, () -> employeeService.getEmployeeById(updated.getId()));
    }
}
