package com.pravin.nit;

public class InputNumberDays {

	public static void main(String[] args) 
	{
		int days=Integer.parseInt(args[0]);
		int year=(days/365);
		int month=(days/365/30);
		int day=(days/365/7);
		System.out.println("number of year :"+year);
		System.out.println("month :"+month);
		System.out.println( "day :"+day);
	

	}

}
