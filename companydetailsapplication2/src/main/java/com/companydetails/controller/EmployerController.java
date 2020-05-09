package com.companydetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.companydetails.entities.Employer;
import com.companydetails.exceptionhandler.EmployerNotFoundException;
import com.companydetails.service.EmployerService;

@RestController
public class EmployerController {
	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}

	@GetMapping(path = "/manager", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employer>> getAllEmployers() {
		return new ResponseEntity<List<Employer>>(employerService.getAllEmployers(), HttpStatus.OK);
	}

	@GetMapping(path = "/manager/{employerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getEmployerById(@PathVariable(name = "employerId") Long employerId) {
		Employer employer = employerService.findByEmployerId(employerId)
				.orElseThrow(() -> new EmployerNotFoundException("manager not found : " + employerId));
		return new ResponseEntity<Employer>(employer, HttpStatus.OK);
	}

	@GetMapping(path = "/managername/{employerName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getEmployerByName(@PathVariable(name = "employerName") String employerName) {
		Employer employer = employerService.findByEmployerName(employerName)

				.orElseThrow(() -> new EmployerNotFoundException("manager not found : " + employerName));

		return new ResponseEntity<Employer>(employer, HttpStatus.OK);
	}

}