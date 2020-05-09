package com.companydetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.companydetails.entities.Employee;
import com.companydetails.entities.Employer;
import com.companydetails.repository.EmployerRepository;

@SpringBootApplication
public class CompanyDetailsApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(CompanyDetailsApplication.class, args);
	}

	@Autowired
	private EmployerRepository employerRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Employer e1 = new Employer("Raj"); Employer e2 = new Employer("Ravi");
		 * Employee e3 = new Employee("Manoj", "Chennai", "sales", 9000, e1);
		 * e3.setEmployer(e1); Employee e4 = new Employee("Mohan", "Bangalore",
		 * "finance", 20000, e1); e4.setEmployer(e1); Employee e5 = new
		 * Employee("Kishore", "Chennai", "sales", 9500, e2); e5.setEmployer(e2);
		 * Employee e6 = new Employee("John", "Kerala", "marketting", 18000, e2);
		 * e6.setEmployer(e2); e1.getEmployee().add(e3); e1.getEmployee().add(e4);
		 * e2.getEmployee().add(e5); e2.getEmployee().add(e6);
		 * employerRepository.save(e1); employerRepository.save(e2);
		 * 
		 */ }
}