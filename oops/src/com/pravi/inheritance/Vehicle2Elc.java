package com.pravi.inheritance;

public class Vehicle2Elc
{

	public static void main(String[] args)
	{
		car1 car = new car1("Audi", "Q8", 2021, 4);
        System.out.println("\nCar Details:");
        car. displayDetails();
       

        Bike1 bike = new Bike1("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike. displayDetails();
        
}

}
