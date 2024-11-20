package com.pravi.copyConstructor;

public class CopyConstructor {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1111,"pravin");
		Manager m1 =new Manager(e1);
		System.out.println(m1);

	}

}
