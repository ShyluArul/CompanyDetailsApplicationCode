package com.companydetails.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.companydetails.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public Optional<Employee> findByEmployeeId(Long employeeId);

	public Optional<Employee> findByEmployeeName(String employeeName);
}
