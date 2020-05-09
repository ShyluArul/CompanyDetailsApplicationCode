package com.companydetails.service;

import java.util.List;
import java.util.Optional;
import com.companydetails.entities.Employer;

public interface EmployerService {
	public List<Employer> getAllEmployers();

	public Optional<Employer> findByEmployerId(Long employerId);

	public Optional<Employer> findByEmployerName(String employerName);
}
