package com.pravi.multillevelInheritance;



public class Animal1Elc {

	public static void main(String[] args) 
	{
	     Lion l =new Lion("simba",5,20);
		System.out.println("\nLion detail:\n");
		l.makeSound();
		l.displayManeLength();
		
		
		
		Elephant e=new Elephant("jumbo",5,4.7);
		System.out.println("\n Elephant detail:\n");
		e.makeSound();
		e.TuskLength();
		
	}
	

}
