package com.pravi.Multithreading;

import java.util.Scanner;

public class BatchAssignementTask extends Thread
{
	@Override
	public void run()
	{
		{
			String name=Thread.currentThread().getName();
			
			if(name!=null && name.equalsIgnoreCase("placement"))
			{
				this.placementBatch();
			}
			else if(name!=null && name.equalsIgnoreCase("Regular"))
			{
				this.regularBatch();
			}
			else
			{
				throw new NullPointerException("Name can't be null");
				
			}
		}
	}
	

	private void regularBatch() 
	{
		System.out.println("I am regualr batch student");
		
	}


	private void placementBatch()
	{
		System.out.println("I am placement batch student");
		
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enetr your batch:");
			String title=sc.next();
			BatchAssignementTask batch=new BatchAssignementTask();
			batch.setName(title);
			batch.start();
		
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}


