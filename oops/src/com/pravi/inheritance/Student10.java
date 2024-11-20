package com.pravi.inheritance;

public class Student10
{
	public static void main(String[] args) 
	{
		
		ScienceStudent s = new ScienceStudent("Anjali", 101, 85, 90, 80);
		System.out.println("Science student detail:");
		s.displayDetails();
	     System.out.println("Science percenage:"+s.calculatePercentage());
	        
	     
	     
	     
	  
        ArtsStudent a = new ArtsStudent("Aryan", 102, 75, 80, 85);
        System.out.println(" Art student detail:");
        a.displayDetails();       
        System.out.println("art percentage:"+a.calculatePercentage());
	}
}

