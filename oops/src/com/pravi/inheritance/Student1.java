package com.pravi.inheritance;
class Student1
{
	protected String name;
	protected  int  rollNumber;
	
	public Student1(String name, int  rollNumber) 
	{
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
		public void displayDetails()
		{
			System.out.println("student name:"+name);
			System.out.println("student roll number :"+rollNumber);
			
			}
		
		public  double calculatePercentage()
		{
			
			return 0;
			
		}
}

class ScienceStudent extends  Student1
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("physicsMarks:"+physicsMarks);
		System.out.println("chemistryMarks:"+chemistryMarks);
		System.out.println("mathMarks:"+mathMarks);
		
	}
	@Override
	public  double calculatePercentage()
	{
		
		return (physicsMarks+chemistryMarks+mathMarks)/3;
		
		
	}
}

class  ArtsStudent extends  Student1
{
	private int  historyMarks;
	private int geographyMarks;
	private int  englishMarks;
	
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) 
	{
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("historyMarks:"+historyMarks);
		System.out.println("geographyMarks:"+geographyMarks);
		System.out.println("englishMarks:"+englishMarks);
		
	}
	@Override
	public  double calculatePercentage()
	{
		
		return (englishMarks+geographyMarks+englishMarks)/3;
		
		
	}
}
