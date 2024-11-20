package com.encaps.intro;
class BankAccount1
{
	private int accountNumber;
	private int password;
	public void setter(int x,int y)
	{
		accountNumber=x;
		password =y;
	}
	int getter1()
	{
		return accountNumber;	
	}
	int getter2() 
	{
		return password;
	}
}
public class Day02 {

	public static void main(String[] args) 
	{
		 BankAccount1 ba=new BankAccount1();
		 ba.setter(8899556,1234);
		 System.out.println(ba.getter1());
		 System.out.println(ba.getter2());
	}

}
