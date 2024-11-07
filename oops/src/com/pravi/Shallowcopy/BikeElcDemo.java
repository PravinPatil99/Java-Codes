package com.pravi.Shallowcopy;

public class BikeElcDemo 
{

	public static void main(String[] args) {
		Bike b1=new Bike("r15","black", 80000);
	   System.out.println(b1);
	
	Bike b2=b1;
	b2.setBikeName("ktm");
	b2.setBikecolour("white");
	b2.setBikePrice(120000);
	System.out.println(b1);
	System.out.println(b2);
    
	}
		
		

}
