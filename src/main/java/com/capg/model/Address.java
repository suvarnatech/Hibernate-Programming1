package com.capg.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Address {

	@Column(name = "ADDRESS_STREET")
	private String street;
	@Column(name = "ADDRESS_PINCODE")
	private String pinCode;
	@Column(name = "ADDRESS_STATE")
	private String state;
	@Column(name = "ADDRESS_EMAIL")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pinCode=" + pinCode + ", state=" + state + "]";
	}

}
