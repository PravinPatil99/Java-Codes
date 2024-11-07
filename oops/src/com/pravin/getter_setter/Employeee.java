package com.pravin.getter_setter;

public class Employeee 
{
	private double employeeSalary;

	public Employeee(double employeeSalary) {
		super();
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employeee [employeeSalary=" + employeeSalary + "]";
	}
	
	

}
