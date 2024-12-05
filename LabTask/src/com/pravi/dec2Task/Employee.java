package com.pravi.dec2Task;

 class Employee 
{
	private int id;
	private String name;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	
	public void claculateGrossSalary()
	{
		System.out.println("Gross Salary is :"+basicSalary+HRAper+DAper);
	}
	}
 
class Manager
{
	private int id;
	private String name;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	private double projctAllowance;
	
	public double  claculateGrossSalary()
	{
	
	 double grossSal;
	return   grossSal=(basicSalary +HRAper + DAper + projctAllowance);
	}
	}

class Trainer
{
	private int id;
	private String name;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	private int batchCount ;
	private double perkperBatch;
	
	public double claculateGrossSalary()
	{
		double grossSal;
		return grossSal=(basicSalary +HRAper +DAper +(batchCount * perkperBatch)
);
		
	}
}

class Sourcing
{
	private int id;
	private String name;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkEnrollment;
	
	public double calcualteGrossSalary()
	{
		double grossSal;
		return grossSal=(basicSalary +HRAper +DAper +((enrollmentReached/enrollmentTarget)*100)*perkEnrollment)
;
	}
}


