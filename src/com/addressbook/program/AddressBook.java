package com.addressbook.program;

import java.util.Scanner;

public class AddressBook {

		Scanner sc = new Scanner(System.in);
		
		ContactPerson contact = new ContactPerson();
		
		public void addContact() {
			System.out.println("Enter your FirstName: ");
			contact.setFirstName(sc.next());
			System.out.println("Enter your LastName: ");
			contact.setLastName(sc.next());
			System.out.println("Enter your Email: ");
			contact.setEmailId(sc.next());
			System.out.println("Enter your Address: ");
			contact.setAddress(sc.next());
			System.out.println("Enter your City: ");
			contact.setCity(sc.next());
			System.out.println("Enter your State: ");
			contact.setState(sc.next());
			System.out.println("Enter your Pincode: ");
			contact.setPincode(sc.nextInt());
			System.out.println("Enter your Mobile Number: ");
			contact.setphoneNumber(sc.nextLong());
		}
		
		public void showContacts() {
			System.out.println(contact.toString());
		}

}
