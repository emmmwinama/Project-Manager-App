package tech.emmmwinama.blog.repository;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.blog.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
