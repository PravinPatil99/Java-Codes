package com.pravi.ExceptionHandeling;

import java.util.Scanner;

class exception
{
	public static void handleException(String a)
	
	{
		try {
			int x=Integer.parseInt(a);
			System.out.print("Array lenght:"+a.length());
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.toString());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	} 


public static void handeler(int c,int d)
{
	try {
		int result=c/d;
		System.out.println("result is:"+result);
		
	}
	
	catch(ArithmeticException e)
	{
		System.err.println(e.toString());
	}
	
	catch(Exception e)
	{
		System.err.println(e);
		
	}
	
}
	
}

public class exceptionDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String:");
		String a=sc.next();
		exception.handleException(a);
		
		System.out.println("______________________________");
		
		System.out.println("Enter the first value:");
		int c=sc.nextInt();
		
		System.out.println("Enter the second value:");
		int d=sc.nextInt();
		exception.handeler(c, d);
		
		
sc.close();
	}
	

}
