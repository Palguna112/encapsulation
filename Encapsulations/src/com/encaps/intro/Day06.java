package com.encaps.intro;
class BankAccount{
	private int accountNumber;
	private int password;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
public class Day06 {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.setAccountNumber(3333);
		ba.setPassword(8989);
		System.out.println("Account Number is:"+ba.getAccountNumber());
		System.out.println("Password is :"+ba.getPassword());
	}

}
