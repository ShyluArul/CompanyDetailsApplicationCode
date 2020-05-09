package com.companydetails.service;

import java.util.List;
import java.util.Optional;
import com.companydetails.entities.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Optional<Employee> findByEmployeeId(Long employeeId);

	public Optional<Employee> findByEmployeeName(String employeeName);

	public List<Employee> getByEmployeeSalary(double employeeSalary);
}
