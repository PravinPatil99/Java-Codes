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
		FullTimeEmployee f1=new FullTimeEmployee(100,"Kiran",40000,5000);
		f1.calculateSalary();
		f1.genratePayroll();
	}

}

/*Employee Management System:

Employee Interface :

Create an interface named Employee with two methods: 

Method Name   :calculateSalary() 
Return Type      :double
Acess Modifier  :public 

Method Name  : generatePayroll()
Return Type     :void
Acess Modifier :public 

The calculateSalary() method should compute the salary for the employee.
The generatePayroll() method should generate the payroll information for the employee.

FullTimeEmployee Class :

Implement a class named FullTimeEmployee that implements the Employee interface.

Include Attributes :
employeeId     	:(int)
employeeName   	:(String)
monthlySalary 	:(double) 
benefits 			:(double)

Acess modifier :private(for all the varriable )

Provide a constructor that initializes the employee details.

Implement the calculateSalary() method to calculate the salary for a full-time employee, including benefits.

Implement the generatePayroll() method to print the payroll information for a full-time employee.

Testing :

Take a main clas  Employee Management System.
Create instances of  FullTimeEmployee.
Call the calculateSalary() and generatePayroll() methods to ensure correct calculations and information generation.

Test Case 1 : 
--------------
for Negative Salary
Sample Input:
if user eneterd negative salary

Expected Output :
Error: Monthly salary cannot be negative.


Test Case 2 :
--------------
 Empty Employee Name
Input:

if employee is passed by the user is ""(empty)

Expected Output:

Error: Employee name cannot be empty.

Test Case 3 :
--------------
Sample Input :
if all the information is valid input

Expected Output :
Print all the detail information.
 * 
 * 
 */
