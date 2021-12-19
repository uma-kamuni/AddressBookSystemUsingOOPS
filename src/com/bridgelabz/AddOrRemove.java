package com.bridgelabz;
import com.bridgelabz.detailsAddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddOrRemove {
	ArrayList <detailsAddressBook> detailsAddressBookArrayList = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);

	public ArrayList addPerson() {

		detailsAddressBook details = new detailsAddressBook();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the following address details ");
		System.out.println("Enter the First Name :");
		details.setFirstName(input.nextLine());
		System.out.println("First Name :" + details.getFirstName());

		System.out.println("Enter the last name:");
		details.setLastName(input.nextLine());
		System.out.println("Last Name: " + details.getLastName());

		System.out.println("Enter your email address:");
		details.setEmailAddress(input.nextLine());
		System.out.println("email address: " + details.getEmailAddress());

		System.out.println("Enter your address:");
		details.setAddress(input.nextLine());
		System.out.println("address: " + details.getAddress());

		System.out.println("Enter your city name:");
		details.setCity(input.nextLine());
		System.out.println("City :" + details.getCity());

		System.out.println("Enter your state:");
		details.setState(input.nextLine());
		System.out.println("State:" + details.getState());

		System.out.println("Enter your pin code:");
		details.setZip(input.nextLong());
		System.out.println("Zip:" + details.getZip());

		System.out.println("Enter your phone number:");
		details.setPhoneNumber(input.nextLong());
		System.out.println("Phone Number:" + details.getPhoneNumber());

		detailsAddressBookArrayList.add(details); // Adding details data
		return detailsAddressBookArrayList;

	}

	public void displayPerson() {
		if (detailsAddressBookArrayList.size() == 0) {
			System.out.println("Address book EMPTY: You must add the details in Address Book Contact ");
		} else {
			System.out.println("All contact =  " + detailsAddressBookArrayList.size());
			System.out.println(detailsAddressBookArrayList);
		}
	}

	public void editPerson() {
		System.out.println("Enter a first name you want to edit...");
		String editName = scanner.nextLine();

		boolean found = false;
		for (detailsAddressBook details : detailsAddressBookArrayList) {
			if (details.getFirstName().equals(editName)) {
				found = true;
				System.out.println(details);

				System.out.println(
						"What do you want to edit \n" + "1. First Name / 2. Last Name / 3. Address / 4. City / "
								+ "5. State / 6. Zip code / 7. Phone Number / 8. Email");

				int choice = scanner.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter a new First Name");
					String newFirstName = scanner.next();
					details.setFirstName(newFirstName);
					break;

				case 2:
					System.out.println("Enter a new Last Name");
					String lastName = scanner.next();
					details.setLastName(lastName);
					break;
				case 3:
					System.out.println("Enter a new Address");
					String address = scanner.next();
					details.setAddress(address);
					break;
				case 4:
					System.out.println("Enter a new City");
					String city = scanner.next();
					details.setAddress(city);
					break;
				case 5:
					System.out.println("Enter a new State");
					String state = scanner.next();
					details.setState(state);
					break;
				case 6:
					System.out.println("Enter a new ZipCode");
					Long zip = scanner.nextLong();
					details.setZip(zip);
					break;
				case 7:
					System.out.println("Enter a new Phone Number");
					Long phoneNumber = scanner.nextLong();
					details.setPhoneNumber(phoneNumber);
					break;
				case 8:
					System.out.println("Enter a new Email Address");
					String email = scanner.next();
					details.setEmailAddress(email);
					break;

				default:
					System.out.println("You Press Wrong option ");

				}

			}

		}
		if (found) {
			System.out.println("Your Edit Choice is Update SUCCESSFULLY");
		} else {
			System.out.println("First Name is not found");
		}

	}

	
	public void removePerson() {

        System.out.println("Enter a first name you want to delete...");
        String removeName = scanner.next();

        boolean found = false;
        for (int i = 0; i < detailsAddressBookArrayList.size(); i++) {
            if (detailsAddressBookArrayList.get(i).getFirstName().equals(removeName))
            {
                found = true;
                detailsAddressBookArrayList.remove(i);
            }

        }
        if (found) {
            System.out.println("ADDRESS CONTACT BOOK IS DELETED SUCCESSFULLY");
        } else {
            System.out.println("First Name not found");
        }
    }
}