package com.pravi.inheritance;

class animal
{

	void eat()
	{
		System.out.println("This animal eat food");
	}
}
	
	class Dog extends animal
	{
		void bark()
		{
			System.out.println("the dog barks");
		}
	
}
	

public class Test4 {
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
		System.out.println(d);
				
		
	}
}





