package com.companydetails.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.companydetails.entities.Employer;
import com.companydetails.repository.EmployerRepository;

@Service
@Transactional
public class EmployerServiceImplementation implements EmployerService {
	@Autowired
	private EmployerRepository employerRepository;

	@Override
	public List<Employer> getAllEmployers() {
		return employerRepository.findAll();
	}

	@Override
	public Optional<Employer> findByEmployerId(Long employerId) {
		return employerRepository.findByEmployerId(employerId);
	}

	@Override
	public Optional<Employer> findByEmployerName(String employerName) {
		return employerRepository.findByEmployerName(employerName);
	}
}
