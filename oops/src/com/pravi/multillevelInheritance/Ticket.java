package com.pravi.multillevelInheritance;

public class Ticket
{
	private String eventName;
	private int setNumber;
   private double  price;

public Ticket(String eventName, int setNumber, double price) 
{
	super();
	if(price<=0||setNumber<=0)
	{
		System.err.println("Error Invalid Input");
	}
	
	this.eventName = eventName;
	this.setNumber = setNumber;
	this.price = price;
}

public String getEventName() {
	return eventName;
}

public void setEventName(String eventName) {
	this.eventName = eventName;
}

public int getSetNumber() {
	return setNumber;
}

public void setSetNumber(int setNumber) {
	this.setNumber = setNumber;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public void displayTicket()
{
	System.out.println("eventName:"+eventName);
	System.out.println("setNumber:"+setNumber);
	System.out.println("price:"+price);
	
}

}

class VipTicket extends Ticket
{
	private String specialAcess;

	
	public VipTicket(String eventName, int setNumber, double price, String specialAcess) {
		super(eventName, setNumber, price);
		this.specialAcess = specialAcess;
	}


	public String getSpecialAcess() {
		return specialAcess;
	}


	public void setSpecialAcess(String specialAcess) {
		this.specialAcess = specialAcess;
	}
	@Override
public void displayTicket()
{
		super.displayTicket();
		System.out.println("specialAcess:"+specialAcess);
	
}

	
}
class StudentTicket extends Ticket
{
	private boolean studentDiscont;

	public StudentTicket(String eventName, int setNumber, double price, boolean studentDiscont) {
		super(eventName, setNumber, price);
		this.studentDiscont = studentDiscont;
	}

	public boolean isStudentDiscont() {
		return studentDiscont;
	}

	public void setStudentDiscont(boolean studentDiscont) {
		this.studentDiscont = studentDiscont;
	}
	@Override
public void displayTicket()
{
		super.displayTicket();
	System.out.println("studentDiscont:"+studentDiscont);
}
	

}
