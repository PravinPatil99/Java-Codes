package com.pravi.inheritance;

public class Vehicle2 
{
	
	protected String make;
    protected  String model;
      protected int year;
	
	public Vehicle2(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails()
	{
		System.out.println("make:"+make);
		System.out.println("model:"+model);
		System.out.println("year:"+year);
	}
}
	class car1 extends Vehicle2
	{
		protected int numberOfDors;
    
		public car1(String make, String model, int year, int numberOfDors) {
			super(make, model, year);
			this.numberOfDors = numberOfDors;
		}
		@Override
		public void displayDetails()
		{
			
			System.out.println("make:"+make);
			System.out.println("model:"+model);
			System.out.println("year:"+year);
			System.out.println("number of door:"+numberOfDors);
			}
	}
		class Bike1 extends Vehicle2
		{
			protected String type;

			
			public Bike1(String make, String model, int year, String type) 
			{
				super(make, model, year);
				this.type = type;
			}
			@Override
			public void displayDetails()
			{
				super.displayDetails();
				System.out.println("bike type is:"+type);
				//System.out.println("make:"+make);
			//	System.out.println("model:"+model);
				//System.out.println("year:"+year);
		}
			
		}
		
    
