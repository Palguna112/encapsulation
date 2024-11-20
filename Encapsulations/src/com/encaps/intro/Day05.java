package com.encaps.intro;

import java.util.Scanner;

class Customer3 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String Password;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}

public class Day05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of objects to be created");
		int n = scan.nextInt();

		Customer3[] customerArr = new Customer3[n];
		for (int i = 0; i < n; i++) {
			Customer3 c = new Customer3();
			System.out.println("Enter the id for" + (i + 1) + "Customer");
			c.setId(scan.nextInt());
			System.out.println("Enter the name");
			c.setName(scan.next());
			System.out.println("Enter the email");
			c.setEmail(scan.next());
			System.out.println("Enter the phone number");
			c.setPhone(scan.nextLong());
			System.out.println("Enter the password");
			c.setPassword(scan.next());
			System.out.println("Enter the address");
			scan.nextLine();
			c.setAddress(scan.nextLine());
			customerArr[i] = c;

		}
		for (Customer3 c : customerArr) {
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getEmail());
			System.out.println(c.getPhone());
			System.out.println(c.getPassword());
			System.out.println(c.getAddress());
			System.out.println("_________________");
		}
	}

}
