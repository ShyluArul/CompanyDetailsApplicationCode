package com.companydetails.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.companydetails.entities.Employee;
import com.companydetails.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Optional<Employee> findByEmployeeId(Long employeeId) {
		return employeeRepository.findByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getByEmployeeSalary(double employeeSalary) {
		List<Employee> getEmployeeBySalary = (List<Employee>) employeeRepository.findAll();
		return getEmployeeBySalary.stream().filter(p -> p.getEmployeeSalary() > employeeSalary)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Employee> findByEmployeeName(String employeeName) {
		return employeeRepository.findByEmployeeName(employeeName);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
