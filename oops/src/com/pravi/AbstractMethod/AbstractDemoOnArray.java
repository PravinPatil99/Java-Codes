package com.pravi.AbstractMethod;

 abstract class Animal
{
	abstract void checkup();
}

 class Lion extends Animal
 {
	 protected String name;

	public Lion(String name) {
		super();
		this.name = name;
	}
	@Override
	public void checkup()
	{
		System.out.println("Lion:");
		System.out.println(name + " is going to chekup");
	}
	 
 }
 class  Elephant extends Animal
 {
	 protected String name;

	public Elephant(String name) {
		super();
		this.name = name;
	}
	@Override
	public void checkup()
	{
		System.out.println("Elephant:");
		System.out.println(name + " is going to checkup");
		
	}
	 
}
 class Horse extends Animal
 {
	 protected String name;

	public Horse(String name) {
		super();
		this.name = name;
	}
	 
	public void checkup()
	{
		System.out.println("Horse:");
		System.out.println(name + " is going to chekup");
		
	}
	
 }
public class AbstractDemoOnArray 
{

	public static void main(String[] args)
	{
		Lion lions[]= {new Lion("Simba"),new Lion("MyLion")};
		
		Elephant elephants[]= {new Elephant("Sheka"),new Elephant("RAma")};
		
		Horse horses[]= {new Horse("Chetak"),new Horse("MyHorse")};
		
		visitZooForCheckup(lions);
		System.out.println();
		visitZooForCheckup(elephants);
		System.out.println();
		visitZooForCheckup(horses);
		
		

	}

	public static void visitZooForCheckup( Animal... animal)
	{
		for(Animal animals:animal)
		{
			animals.checkup();
			
		}
	}
}
