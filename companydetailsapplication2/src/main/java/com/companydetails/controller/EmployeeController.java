package com.companydetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.companydetails.entities.Employee;
import com.companydetails.exceptionhandler.EmployeeNotFoundException;
import com.companydetails.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(path = "/employee/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "employeeId") Long employeeId) {
		Employee employee = employeeService.findByEmployeeId(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found : " + employeeId));
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@GetMapping(path = "/employeesalary/{employeeSalary}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getEmployeeBySalary(
			@PathVariable(name = "employeeSalary") double employeeSalary) {
		return new ResponseEntity<List<Employee>>(employeeService.getByEmployeeSalary(employeeSalary), HttpStatus.OK);
	}

	@GetMapping(path = "/employeename/{employeeName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable(name = "employeeName") String employeeName) {
		Employee employee = employeeService.findByEmployeeName(employeeName)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found : " + employeeName));
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@GetMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
	}
}
