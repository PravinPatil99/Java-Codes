package com.pravi.multillevelInheritance;

public class Animal 
{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public  void animalDetail()
	{
		System.out.println("name:"+name);
	}
	}
class Mammal extends Animal
{
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
   //  @override
	public void displayDetail()
	{
		super.animalDetail();
		System.out.println("hasFur:"+hasFur);
	}
	}
class Dog extends Mammal
{
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public  void displayDetail()
	
	{
		super.displayDetail();
		System.out.println("breed:"+breed);
	}

}
