package com.pravi_FunctionalProgramming;
@FunctionalInterface
interface Bike
{
	
	
	void speed();

	default void  r15()
	{
		System.out.println("company yamaha have r15");
		
	}
	static void bullet()
	{
		System.out.println("royalenfield");
		
	}
	
}

public class Vehicle
{
	public static void main (String[]args)
	{
		Bike yamaha=new Bike()
				{
			@Override
			public void speed()
			{
				System.out.println("yamaha speed is 150km/hr");
				}
				};
				Bike bullet =new Bike()
						{
					public void speed()
					{
						System.out.println("Bulllet speed is 140");
						
					}
					
						};
						yamaha.r15();yamaha.speed();
						bullet.speed();
					
						
						
		
	}
}
