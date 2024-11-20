package com.encaps.intro;
import java.util.Scanner;
class Customer2 {
	private int id;
	private String name;
	private String email;
	private long phoneNumber;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class Day04 {

	public static void main(String[] args) {
		Customer2 c = new Customer2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scan.nextInt();
		c.setId(id);
		System.out.println("Enter the Name");
		String name = scan.next();
		c.setName(name);
		System.out.println("Enter the Email");
		String email = scan.next();
		c.setEmail(email);
		System.out.println("Enter the PhoneNumber");
		long phoneNumber = scan.nextLong();
		c.setPhoneNumber(phoneNumber);
		scan.nextLine();
		System.out.println("Enter the Address");
		String address = scan.nextLine();
		c.setAddress(address);

		Customer2[] customerArr = new Customer2[1];
		customerArr[0] = c;
		System.out.println(customerArr[0].getId() + " " + customerArr[0].getName() + " " + customerArr[0].getEmail()
				+ " " + customerArr[0].getPhoneNumber() + " " + customerArr[0].getAddress());

	}

}
