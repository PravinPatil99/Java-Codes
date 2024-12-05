package com.pravi.StaticMethod;

public class Test1 
{ 
	{
	int x = 0;
		Test1.x = x+x;
	}

	static int x=10;
	
	public static void main(String[] args) 
	{
		System.out.println("Class Level X : "+Test1 .x);
	}

	static 
	{
		x = x+Test1.x;
	}
}

	

