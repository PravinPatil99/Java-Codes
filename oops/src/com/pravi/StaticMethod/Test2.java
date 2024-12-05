package com.pravi.StaticMethod;

class Test2
{ 
	  int x = 10; 
	public static void main(String[] args) 
	{ 
		Test2 t1 = new Test2(); 
		System.out.println(t1.x); //10
	} 
	static
	{ 
		int x = 20; 
		System.out.print(x + " "); //20
	} 
}