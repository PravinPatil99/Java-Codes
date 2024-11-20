package com.pravi.inheritance;

class Bike
{
	String name;
	int average;
	String color;
	
	public Bike(String name, int average, String color) {
		super();
		this.name = name;
		this.average = average;
		this.color = color;
		
	}
}

	class Vehicle extends Bike
	{
		String Type;
		double price;
		
		public Vehicle(String name, int average, String color, String Type, double price) {
			super(name, average, color);
			this.Type = Type;
			this.price = price;
		}
			void details()
			{
				System.out.println("bike color is: "+color);
				
			}
			@Override
			public String toString() {
				return "Vehicle [vehicleType=" + Type + ", price=" + price + ", name=" + name + ", average="
						+ average + ", color=" + color + "]";
			}
			
			}


	
		
	public class Test3 
	{
		public static void main (String[]args)
		{
		
		Vehicle v= new Vehicle  ("r15",12,"white","2 whell",120000);
		v.details();
		System.out.println(v);
		
		}
	}

	
	

	



