package com.addressbook.program;

public class ContactPerson {
	
	private String fristName, lastName, emailId, address, city, state;
	private int pincode;
	private long phoneNumber;
	
	ContactPerson() {}

	public ContactPerson(String fristName, String lastName, String emailId, String address, String city, String state,
			int pincode, long phoneNumber) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "ContactPerson [firstName=" + fristName + ", lastName=" + lastName + ", emailId=" + emailId + ", address="
				+ address + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
