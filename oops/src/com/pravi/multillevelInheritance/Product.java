package com.pravi.multillevelInheritance;

 class Product 
{
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		super();
		if(price<=0)
		{
			System.err.println("Error invalid input");
		}
		this.name = name;
		this.price = price;
	}
	public void displayInfo()
	{
		System.out.println("Product name:"+name);
		System.out.println("product price:"+price);
		
	}
	public double calculateTotalCost(int quantity) 
	{
		if(quantity<=0)
		{
			System.err.println("Error invaid input");
		}
		
		double q =price*quantity;
		return q;
	
}
}
	
 class Electronic extends Product
 {
	 private String brand;
	
	public Electronic(String name, double price, String brand)
	{
		super(name, price);
		this.brand = brand;
		
	}
	@Override
	public void  displayInfo()
	{
		super.displayInfo();
		System.out.println("Product brand :"+brand);
		}
 }
	
class Clothing extends Product
 {
	 private String size;

		public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
     @Override
	public void displayInfo()
	{
    	 super.displayInfo();
		System.out.println("Product size is :"+size);
	}
     
	
 }
 
 
