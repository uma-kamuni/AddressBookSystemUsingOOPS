package com.bridgelabz;

import java.util.Scanner;

public class AddressBookProgram {

	// public static void getInput() {
	// detailsAddressBook details = new detailsAddressBook();
	// Scanner input = new Scanner(System.in);
	// System.out.println("Enter the following address details ");
	// System.out.println("Enter the First Name :");
	// details.setFirstName(input.nextLine());
	// System.out.println("First Name :" + details.getFirstName());

	// System.out.println("Enter the last name:");
	// details.setLastName(input.nextLine());
	// System.out.println("Last Name: " + details.getLastName());

	// System.out.println("Enter your email address:");
	// details.setEmailAddress(input.nextLine());
	// System.out.println("email address: " + details.getEmailAddress());

	//	System.out.println("Enter your address:");
	// details.setAddress(input.nextLine());
	// System.out.println("address: " + details.getAddress());

	// System.out.println("Enter your city name:");
	// details.setCity(input.nextLine());
	// System.out.println("City :" + details.getCity());

	// System.out.println("Enter your state:");
	// details.setState(input.nextLine());
	// System.out.println("State:" + details.getState());

	//	System.out.println("Enter your pin code:");
	// details.setZip(input.nextLong());
	// System.out.println("Zip:" + details.getZip());

	// System.out.println("Enter your phone number:");
	// details.setPhoneNumber(input.nextLong());
	// System.out.println("Phone Number:" + details.getPhoneNumber());

//	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//	getInput();
		OptionMenu operation = new OptionMenu(); // created object of OptionMenu
		operation.operation();
	}

}
