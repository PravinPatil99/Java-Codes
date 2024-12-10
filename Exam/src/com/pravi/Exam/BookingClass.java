package com.pravi.Exam;

public class BookingClass 
{
	protected String name;
	protected double price;
	
	public BookingClass(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String bookFlight(String airlines)
	{
		return airlines;
	}
	public int bookHotel(int numberOfNights)
	{
		return numberOfNights;
	}
	public String bookActivity(String activityType)
	{
		return activityType;
	}
	@Override
	public String toString() {
		return "BookingClass [name=" + name + ", price=" + price + "]";
	}

}
class Flight extends BookingClass 
{
 
	public Flight(String name, double price) 
	{
		super(name, price);
	}
	@Override
	public String bookFlight(String airlines)
	{
		return airlines;
	}
}

class Hotel extends BookingClass 
{

	public Hotel(String name, double price) 
	{
		super(name, price);
	}
	
	@Override
	public int bookHotel(int numberOfNights)
	{
		return numberOfNights;
	}
}


class Activity extends BookingClass 
{

	public Activity(String name, double price) 
	{
		super(name, price);
	}
	
	@Override
	public String bookActivity(String activityType)
	{
		return activityType;
	}
	
	
}
