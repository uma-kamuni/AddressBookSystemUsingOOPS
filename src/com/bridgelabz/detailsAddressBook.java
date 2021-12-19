package com.bridgelabz;

public class detailsAddressBook {
//  public AddressBookProgram(int contactID, String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String emailAddress)
//  {
//      this.contactID = contactID;
//      this.firstName = firstName;
//      this.lastName = lastName;
//      this.address = address;
//      this.city = city;
//      this.state = state;
//      this.zip = zip;
//      this.phoneNumber = phoneNumber;
//      this.emailAddress = emailAddress;
//  }

	private String firstName;
	@Override
	public String toString() {
		return "detailsAddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", phoneNumber=" + phoneNumber + ", zip=" + zip
				+ ", emailAddress=" + emailAddress + "]";
	}

	private String lastName;
	private String address;
	private String city;
	private String state;
	private long phoneNumber;
	private long zip;
	private String emailAddress;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
