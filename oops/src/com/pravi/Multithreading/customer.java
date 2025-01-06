package com.pravi.Multithreading;

public class customer  extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is running in seprate stack");
		
	}

	public static void main(String[] args) 
	{
		customer cust=new customer();
System.out.println("is child thread isAlive:"+cust.isAlive());
cust.start();
System.out.println("is child thread isAlive "+cust.isAlive());
//cust.start();
	}

}
