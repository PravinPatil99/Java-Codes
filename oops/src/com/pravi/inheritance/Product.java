package com.pravi.inheritance;

public class Product 
{
	protected  String name;
	protected   double price;
	
	public Product(String name, double price) 
	{
		super();
		this.name = name;
		this.price = price;
	}
	
	void displayInfo()
	{
		System.out.println(name);
		System.out.println(price);
		
	}
	 public  double calculateTotalCost(double  quantitiy)
		{
		   return price *quantitiy;
			
		}
}
	
	   
	   class Electronics extends Product 
	   {
		   private String brand;

		public Electronics(String name, double price, String brand) {
			super(name, price);
			this.brand = brand;
		}
		
		public String productdisplayInfo(String brand)
		{
				return ("product brand is:"+brand);
		}
	   }
		class Clothing extends Product
		{
			private String size;

			/**
			 * @param name
			 * @param price
			 * @param size
			 */
			public Clothing(String name, double price, String size) {
				super(name, price);
				this.size = size;
			}

			@Override
			public String toString() {
				return "Clothing [size=" + size + "]";
			}
	
		}
	   
	 
	  

	


	
	


	
	

	

