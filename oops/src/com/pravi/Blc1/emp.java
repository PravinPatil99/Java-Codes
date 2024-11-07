package com.pravi.Blc1;

public class emp 
{
     private double empSalary;

	public emp(double empSalary) 
	{
		super();
		this.empSalary=empSalary;
		}
	
	public double getEmpSalary()
	{
		
		return this.empSalary;
	}
	
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}

	@Override
	public String toString() {
		return "emp [empSalary=" + empSalary + "]";
	}
	
	

}
