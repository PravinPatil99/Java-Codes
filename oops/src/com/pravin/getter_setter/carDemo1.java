package com.pravin.getter_setter;

public class carDemo1 
{
	public static void main(String[] args) 
	{
		car c1=car.GetCarObj();
		System.out.println( c1);
		System.out.println("After one price of the car is");
		
		c1.setCarPrice(300000);
		System.out.println(c1);
		
		c1.setCarMillege(12);
		System.out.println(c1);
		
		
		
	
}

}
