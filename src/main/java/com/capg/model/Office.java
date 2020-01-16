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
@Table(name = "OFFICE")
public class Office {

	@Id
	@GeneratedValue
	@Column(name = "OFFICE_ID")
	private Long officeId;
	@Column(name = "OFFICE_NAME")
	private String officeName;
	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(column = @Column(name="OFFICE_EMAIL"), name = "email") })
	private Address address;

	public Long getOfficeId() {
		return officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

}
