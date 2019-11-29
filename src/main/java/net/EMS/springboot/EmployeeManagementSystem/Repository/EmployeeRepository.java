package net.guides.springboot2.springboot2jpacrudexample.Repository;


import net.guides.springboot2.springboot2jpacrudexample.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
