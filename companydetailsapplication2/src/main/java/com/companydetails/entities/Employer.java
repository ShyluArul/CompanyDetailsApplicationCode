package com.companydetails.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employer_table")
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long employerId;
	public String employerName;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employer")
	private List<Employee> employee = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		employee.add(employee);
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Long getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}

	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", employerName=" + employerName + "]";
	}

	public Employer() {
		super();
	}

	public Employer(String employerName) {
		super();
		this.employerName = employerName;
	}
}
