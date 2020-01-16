package com.capg.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(column = @Column(name="EMPLOYEE_EMAIL"), name = "email") })
	private Address address;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
