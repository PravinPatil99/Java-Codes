package com.pravi.multillevelInheritance;

public class ProducrElcDemo {

	public static void main(String[] args) 
	{
		Electronic electronic =new Electronic("laptop",12000,"Dell");
		System.out.println("\nElectronic detail:\n");
		
		electronic.displayInfo();
     System.out.println(" the total cost of quatity:"+electronic.calculateTotalCost(2));
		
		
		
		Clothing clothing =new Clothing("T-shirt",700,"medium");
		System.out.println("\nClothing detail:\n");
		
		clothing.displayInfo();
		  System.out.println(" the total cost of quatity:"+clothing.calculateTotalCost(3));
			
		
		
		
	}

}
