package com.pravin.getter_setter;

public class EmployeeDemoo {

	public static void main(String[] args) 
	{
		Employeee e1=new Employeee (10000);
		System.out.println(e1);
	   
		System.out.println("After one year ");
		
		e1.setEmployeeSalary(e1.getEmployeeSalary()+1000);
		System.out.println(e1);

	}

}
