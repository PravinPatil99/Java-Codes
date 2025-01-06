package com.pravi.Multithreading;

public class sleepDemo extends Thread

{
	@Override
	public void run()
	
	{
		System.out.println("child thread id is "+Thread.currentThread().getId());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value is "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted :"+e);
			}
			
		}
	}

	public static void main(String[] args)
	{
		System.out.println("main thread id is "+Thread.currentThread().getId());
		sleepDemo s=new sleepDemo();
		sleepDemo s1=new sleepDemo();
		s.start();
		s1.start();
	}

}
