package com.addressbook.program;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook s = new AddressBook();
		int option;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3.EDIT CONTACT");
			System.out.println("Enter the Operation Number");
			option = sc.nextInt();

			switch (option) {
			case 1:
				s.addContact();
				break;
			case 2:
				s.showContacts();
				break;
			case 3:
				s.editContact();
				break;	
			default:
				System.out.println("Wrong Operation Number");
				break;
			}
		} while (option < 4);
		
	}

}
