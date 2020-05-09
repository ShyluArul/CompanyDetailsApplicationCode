package com.companydetails.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.companydetails.entities.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
	public Optional<Employer> findByEmployerId(Long employerId);

	public Optional<Employer> findByEmployerName(String employerName);
}