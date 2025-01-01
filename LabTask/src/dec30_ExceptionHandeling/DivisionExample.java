package dec30_ExceptionHandeling;

import java.util.Scanner;
	
public class DivisionExample
{
	public static int  performdivision(int dividend ,int divisor)
	{
		return dividend/divisor;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the dividend:");
		int dividend=sc.nextInt();
		
		System.out.println("Enter the divisior:");
		int divisor=sc.nextInt();
	
		try {
			
			System.out.println("Result : "+performdivision(dividend,divisor));
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		
		sc.close();
		

	}

	
}
