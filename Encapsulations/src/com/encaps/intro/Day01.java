package com.encaps.intro;

class HumanBeing
{
	private String brain;
	private String heart;
	
	public void setter(String x,String y)
	{
		brain=x;
		heart=y;
	}
	String getter1()
	{
		return brain;
	}
	String getter2()
	{
		return heart;
	}
}
public class Day01
{

	public static void main(String[] args) 
	{
		 HumanBeing hb=new HumanBeing();
		 hb.setter("grey", "red");
		 System.out.println(hb.getter1());
		 System.out.println(hb.getter2());
	}
}


