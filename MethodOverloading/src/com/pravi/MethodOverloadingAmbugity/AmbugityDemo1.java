package com.pravi.MethodOverloadingAmbugity;
class Test
{
	
	public void accept(long... b)
	{
		System.out.println("long:");
		}
	
	public void accept(double... s)
	{
		System.out.println("double:");
	}
	public void accept(float...s )
	{
		System.out.println("float:");
	}
	}

public class AmbugityDemo1 
{

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.accept(12345);

	}

}
