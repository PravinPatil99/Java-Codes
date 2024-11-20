package com.pravi.multillevelInheritance;

 class Animal1 
{
	
private String name;
private int age;

public Animal1(String name, int age) {
	super();
	if(age<=0)
	{
		System.err.println("Error invalid input");
		return;
	}
	

	this.name = name;
	this.age = age;
}

public void makeSound()
{
	System.out.println("The animal make a genral sound");
}
public void displayInfo()
{
  System.out.println("name:"+name);
  System.out.println("age:"+age);
  
}
}
class Lion extends Animal1
{
	private int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		if(maneLength <=0)
		{
			System.err.println("Error invalid input");
			return;
		}
		this.maneLength = maneLength;
	}
	@Override
	public void makeSound()
	{
		super.displayInfo();
		System.out.println("The lion roars loudly");
		
	}
	public void displayManeLength()
	{
		

		System.out.println("mane length is :"+maneLength);;
	
	}
}
class Elephant extends Animal1
{
	private double tuskLength;
	
	public Elephant(String name, int age, double tuskLength) {
		super(name, age);
		if(tuskLength<=0)
		{
			System.err.println("Error invalid input");
			return;
			}
		
			
		this.tuskLength = tuskLength;
	}
	@Override
	public void makeSound()
	{
		super.displayInfo();
		System.out.println("The elephent trumplets");
		
	}
	public void TuskLength()
	{

		System.out.println("Tusk Lenght is:"+tuskLength);
		
	}
}

	

	
	

