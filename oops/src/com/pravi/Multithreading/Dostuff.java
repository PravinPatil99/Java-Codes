package com.pravi.Multithreading;

public class Dostuff extends Thread 
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("Current Thread name is :"+name);
	}

	public static void main(String[] args) 
	{
		Dostuff d1=new Dostuff();
		Dostuff d2=new Dostuff();
		
		d1.start();
		d2.start();
		
	
		System.out.println(Thread.currentThread().getName()+" is running");
		
	}

}
