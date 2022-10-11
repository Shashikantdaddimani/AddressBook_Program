package com.addressbook.program;

import java.util.*;

public class AddressBook {

		Scanner sc = new Scanner(System.in);
		
		ContactPerson contact = new ContactPerson();
		ArrayList<ContactPerson> contactsArrayList = new ArrayList<ContactPerson>();
		
		public void addContact() {
			ContactPerson contact = new ContactPerson();
		
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
			
			contactsArrayList.add(contact);
		}
		
		public void showContacts() {
			System.out.println(contact.toString());
			for (int i = 0; i < contactsArrayList.size(); i++) {
				ContactPerson contacts = contactsArrayList.get(i);
				System.out.println(contacts.toString());
		}
		}
		

		public void editContact() {

			System.out.println("Enter the First Name to Edit : ");
			String FirstName = (sc.next());
			boolean IsAvaible = false;

			for (ContactPerson contact : contactsArrayList) {
				if (contact.getFirstName().equals(FirstName)) {
					IsAvaible = true;

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

		}		
			if (IsAvaible == false) {
				System.out.println("Contact Doesn't exist.");
			}
}
}
			
			
		
