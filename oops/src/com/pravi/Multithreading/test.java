package com.pravi.Multithreading;

public class test  extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is running");
	}

	public static void main(String[] args) 
	{
		test t1=new test();
		System.out.println("main thread is started");
		t1.start();
		System.out.println("main thread is ended ");

	}
}
