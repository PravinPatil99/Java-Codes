package com.pravi.Deep_Copy;

public class productElcDemo {

	public static void main(String[] args)
	{
		Product p1 =new Product(100,"120000");
	    Product p2=new Product();
	    p2.setProductName(p1.getProductName());
	    p2.setProducrPrice(p1.getProducrPrice());
	    
	    System.out.println("Before modification");
	     System.out.println(p1);
	     System.out.println(p2);
	     
	     System.out.println("AFTER modificatio");
	     p1.setProductName(120);
	     p1.setProducrPrice(13000);
	     System.out.println(p1);
	      System.out.println(p2);
		
	
		

	}

}
