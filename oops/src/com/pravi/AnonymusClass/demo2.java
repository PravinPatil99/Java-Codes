package com.pravi.AnonymusClass;

 abstract class vehicle
{
	abstract void run();
}
 
public class demo2 {

	public static void main(String[] args) 
	{
		vehicle v =new vehicle()
				{
			@Override
			public void run()
			{
				System.out.println("Vehicle is running");
			}
			
				};
				
				vehicle car =new vehicle()
				{
					
					public void run()
					{
						System.out.println("car is running");
					}
					
				};
					
				v.run();car.run();
					
						}
	}


