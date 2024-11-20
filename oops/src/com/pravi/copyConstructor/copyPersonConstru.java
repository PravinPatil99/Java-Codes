package com.pravi.copyConstructor;

public class copyPersonConstru {

	public static void main(String[] args)
	{
		
		Person p= new  Person(111,"Pravin patil");
		Student S=new Student(p);

		System.out.println(S);

	}

}
