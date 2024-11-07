package oops.com.pravi.Blc1;

public class EmployeeNew 
{
	String firstName;
	String lastName;
	int employeeid1;
	double salary;
	int noOfProject;
	
	
	public void setEmployeeData(String firstName,String lastName,int employeeid1,double salary, int noOfProject)
	{
		 this.firstName=firstName;
		 this.lastName=lastName;
	     this.employeeid1=employeeid1;
	     this.salary=salary;
	     this.noOfProject=noOfProject;
	}
	
	public void  calculateSalary()
	{
		if(noOfProject>5 && noOfProject<=10)
		{
			salary+=5000;
			
			}
		else if(noOfProject>10 && noOfProject<=20)
		{
			salary+=10000;
		}
		else if(noOfProject>20)
		{
			salary+=15000;
		}
	}
	public void displayDetails()
	{
		System.out.println("name first name of the emp is:"+firstName);
		System.out.println("name last name of the emp is:"+lastName);
		System.out.println("employeeid1 of the emp is:"+employeeid1);
		System.out.println("salary of the emp is:"+salary);
		System.out.println("noOfProject of the emp is:"+noOfProject);
		
		
		
	}
	
}
