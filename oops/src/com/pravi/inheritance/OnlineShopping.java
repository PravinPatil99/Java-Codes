package com.pravi.inheritance;
import java.util.*;
public class OnlineShopping 
{
	
	public static void main (String []args)
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Product name:");
		String name=sc.next();
		
		System.out.println("Enter the  product Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter the product Brand name:");
		String brand=sc.next();
		
		System.out.println("enter the quantity:");
		double  quantitiy=sc.nextInt();
		
		Electronics laptop =new Electronics( name,price,brand);
		System.out.println("Total product & quantity price:"+ laptop.calculateTotalCost(quantitiy));
		System.err.println("=====================================================");
	    System.out.println("Clothing info started:");
		System.out.println("Enter the clothing brand:");
		String name1=sc.next();
		
		System.out.println("Enter the cloth price:");
		double price1=sc.nextDouble();
		
		System.out.println("Ener the shirt size:");
		String size=sc.next(); 
		
		System.out.println("Enter the shirt quantity:");
		double quantitiy1=sc.nextInt();
		
		Clothing shirt=new Clothing(name1,price1,size);
		System.out.println("the total quantity price of clothing:"+shirt.calculateTotalCost(quantitiy1));
		
		double total=laptop.calculateTotalCost(quantitiy)+shirt.calculateTotalCost(quantitiy);
		
		//System.out.println("your total shopping bill is:"+total);
		
		System.out.println("Total bill is:"+(laptop.calculateTotalCost(quantitiy)+shirt.calculateTotalCost(quantitiy1)));
		System.out.println("\t\t THANK YOU\t\t ");
		
		sc.close();
	
	}
}
