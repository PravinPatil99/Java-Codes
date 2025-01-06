package Jan01_ExceptionHandeling;

import java.util.Scanner;

@SuppressWarnings("unused")
		class carsStoppedException1 extends Exception
		{

    	  public carsStoppedException1(String  Errormessage) 
			{
		
				super(Errormessage);
			}
			
		}
	class carPunctureException extends Exception
	{
 
		public carPunctureException(String errormessage)
		{
			super(errormessage);
		}
	}
	
	
	class carHeatException extends Exception
	{

		public carHeatException(String errormeassage) 
		{
			super(errormeassage);
		}
	}
	
	class cardemo
	{
		
	public static void stop(String condition)throws carsStoppedException1
	{
		if(condition.equalsIgnoreCase("stop"))
		{
			throw new carsStoppedException1("car has stop unexpectedly");
			
		}
		else
		{
			System.out.println("car is not stall");
		}

	}
	  
	public static void puncture(String condition) throws carPunctureException
	{
		if(condition.equalsIgnoreCase("puncture"))
		{
			throw new carPunctureException("car is punctured");
			
		}
		else
		{
			System.out.println("car is not stall");
		}
	}
	
	
	public static void carheat(int  temperature) throws carHeatException
	{
		if(temperature >50)
		{
			throw carHeatException("heat is more than 50 degress");
			
		}
		else
		{
			System.out.println("car is not stall");
		}
	}
	}
	public class carExceptiom
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter the car condition");
				String condition=sc.nextLine();
				cardemo.stop("stop");
			
		}
			catch (carsStoppedException1 e)
			{
				System.out.println(e.getMessage());
				
			}
			try
			{
				cardemo.stop("go");
				
			}
			catch(carsStoppedException1 e)
			{
				System.out.println(e.getMessage());
			}
		
	}
		
		
	}
	 
	
	
	
	

