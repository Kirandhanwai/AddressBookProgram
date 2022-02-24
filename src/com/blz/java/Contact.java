package com.blz.java;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zipcode;
	private String state;
	private String phoneNo;
	private String email;

	public Contact(String firstName, String lastName, String address, String city, int zipcode, String state,
			String phoneNo, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
		setPhoneNo(phoneNo);
		setEmail(email);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", zipcode=" + zipcode + ", state=" + state + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

}
