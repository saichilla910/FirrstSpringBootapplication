package net.corejava.demo_example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.corejava.demo_example.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> searchByName(String name);
}
