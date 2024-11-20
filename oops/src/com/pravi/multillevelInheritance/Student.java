package com.pravi.multillevelInheritance;

public class Student 
{
	protected int studentID;
	protected String name;
	protected double examFees;
	
	
	public Student(int studentID, String name, double examFees) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.examFees = examFees;
	}
	
	public void displayDetail()
	{
		
		
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", examFees=" + examFees + "]";
	
	}
	}
class DayScholler extends Student
{
	protected double transportFees;

	public DayScholler(int studentID, String name, double examFees, double transportFees) {
		super(studentID, name, examFees);
		this.transportFees = transportFees;
	}

	@Override
	public String toString() {
		return "DayScholler [studentID=" + studentID + ", name=" + name + ", examFees=" + examFees + ", transportFees="
				+ transportFees + "]";
	}
}
class Hosteller extends Student 
{
	protected double hostleFee;
	

	public Hosteller(int studentID, String name, double examFees, double hostleFee) {
		super(studentID, name, examFees);
		this.hostleFee = hostleFee;
	}


	@Override
	public String toString() {
		return "Hosteller [studentID=" + studentID + ", name=" + name + ", examFees=" + examFees + ", hostleFee="
				+ hostleFee + "]";
	}
	
}
