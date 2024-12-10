package com.pravi.Exam;

public class MainBookingClass 
{

	public static void main(String[] args)
	{
		Flight f=new Flight("Round Trip to Paris",500.0);
		System.out.println(f);
		f.bookFlight("Air France");
		
		 Hotel h=new Hotel("Luxury Suite",200.0);
		 System.out.println(h);
		 h.bookHotel(5);
		 
		 Activity a=new Activity("City Tour",50.0);
		 System.out.println(a);
		 a.bookActivity("Sightseeing");

	} 

}
