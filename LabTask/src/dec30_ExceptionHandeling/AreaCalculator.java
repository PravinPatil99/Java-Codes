package dec30_ExceptionHandeling;

import java.util.Scanner;

public class AreaCalculator 
{
	public static double calculateArea(double length,double width)
	{
		if(length<0||width<0)
		{
			throw new IllegalArgumentException("Length of and width must be positive");
			
		}
		
		return length*width;
			
	    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			
		System.out.println("Enter the length:");
		double  length=sc.nextDouble();
		
		System.out.println("Enter the width:");
		double width=sc.nextDouble();
		sc.close();
		double area=calculateArea(length, width);
		System.out.println("Area of rectangle:"+area);
		
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Error"+e.getMessage());
		}
		
		
		}

}
