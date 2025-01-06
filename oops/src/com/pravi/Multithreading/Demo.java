package com.pravi.Multithreading;

public class Demo extends Thread 
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		System.out.println("  running thread is :"+name);
	}

	public static void main(String[] args)  
	{
		Thread t=Thread.currentThread();
		
		t.setName("parent");
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		d1.setName("child1");
		d2.setName("child2");
		
		d1.start();
		d2.start();
		
		String name=Thread.currentThread().getName();
		
		System.out.println(name +" is Running here ");
		

	}

}
