package com.addressbook.program;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		ContactPerson s = new ContactPerson("shashi","Daddimani","shashi0344daddimani@gmail.com","Hukkeri","Belagavi", "Karnataka", 591309,9113274303l);
//		s.ContactPerson("shashi","Daddimani","shashi0344daddimani@gmail.com","Hukkeri",591309,9113274303l);
		System.out.println(s.toString());
	}

}
