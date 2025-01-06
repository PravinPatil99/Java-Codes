package com.pravi.Multithreading;

public class stuff extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"thread started");
	}
	

	public static void main(String[] args) 
	{
		stuff s1=new stuff();
		stuff s2=new stuff();
		s1.start();
		s2.start();
		System.out.println(10/0);
		
		System.out.println("main thread eneded");

	}

}
