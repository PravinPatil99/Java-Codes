package com.pravi.Blc1;

import oops.com.pravi.Blc1.EmployeeNew;

public class EmployeeNewdemo {

	public static void main(String[] args) 
	{

		EmployeeNew data=new EmployeeNew();
		 
		data.setEmployeeData("pravin","patil",2001,50000,7);
		data.calculateSalary();
		data.displayDetails();
		
		
				

	}

}
