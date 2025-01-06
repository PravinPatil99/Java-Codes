package com.pravi.Multithreading;

//demo on getting name of the thread

public class sample extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<10;i++)
		{
			
			System.out.println("i value"+i+ "by " + name+"thread");
		}
		
	}

	public static void main(String[] args) 
	{
		String name=Thread.currentThread().getName();
	
		sample s=new sample();
		System.out.println(name+"Thread is:"+s.isAlive());
		
		s.start();
		
		System.out.println(name+"Thread is:"+s.isAlive());
		
		for(int i=1;i<10;i++)
		{
			System.out.println("i values "+i+"by "+name+" thread");
			
			
		}

	}

}
