package com.pravi.Shallowcopy;

public class LaptopElcdemo1 
{
	public static void main(String[] args) 
	{
		Laptop laptop1=new Laptop("ACER",60000);
		System.out.println(laptop1);
		
		Laptop laptop2=laptop1;
		laptop2.setLaptopName("HP");
		laptop2.setLaptopPrice(120000);
		
		//System.out.println(laptop1);
		System.out.print(laptop2);
		
		

	}

}
