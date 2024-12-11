package com.pravi.dec11Task;

interface Employee
{
	public double calculateSalary();
	public void genratePayroll();
}
class FullTimeEmployee implements Employee
{

private int employeeID;
	private String employeName;
	private double monthSalary;
	private double benefit;
	
	public FullTimeEmployee(int employeeID, String employeName, double monthSalary, double benefit) 
	{
		super();
		this.employeeID = employeeID;
		this.employeName = employeName;
		this.monthSalary = monthSalary;
		this.benefit = benefit;
		
		if(this.monthSalary<=0)
		{
			System.err.println("Monthly salary cannot be negative.");
			System.exit(0);
		}
		else 
			{
			this.monthSalary=monthSalary;
			}
		
	    if(this.employeName .equals(""))
		{
			System.err.println("Employee name cannot be empty.");
			System.exit(0);
		}
	    else {
	    	this.employeName=employeName;
	    }
	    if(this.benefit<=0)
	    {
	    	System.err.println("Benefit cannot negative");
	    	System.exit(0);
	    }
	    else {
	    	this.benefit=benefit;
	    }
	    if(this.employeeID<100)
	    {
	    	System.err.println("Id must have greate than 100!!");
	    	System.exit(0);
	    }
		
	    else
	    {
	    	this.employeeID=employeeID;
	    }
	}
    
	@Override
	public double calculateSalary()
	{
		
		return monthSalary+benefit;
		
	}
		@Override
	public void genratePayroll()
	{
		System.out.println("employeeID:"+employeeID);
		System.out.println("employeName:"+employeName);
		System.out.println("benefit:"+benefit);
		System.out.println("Total Salary with benifit:"+calculateSalary());
		
	}
	}

public class EmployeeManagementSystem 
{

	public static void main(String[] args)
	{
		FullTimeEmployee f1=new FullTimeEmployee(99,"Kiran",40000,5000);
		f1.calculateSalary();
		f1.genratePayroll();
	}

}
