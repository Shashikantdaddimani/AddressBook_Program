package com.addressbook.program;

public class ContactPerson {
	
	private String firstName, lastName, emailId, address, city, state;
	private int pincode;
	private long phoneNumber;
	
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String next) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
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



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getZip() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public long getphoneNumbe() {
		return phoneNumber;
	}



	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", address="
				+ address + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", phoneNumber=" + phoneNumber + "]";
	}


	

	
		
	
}
