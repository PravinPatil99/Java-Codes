package Dec26_ExceptionHandeling;

import java.util.Scanner;

 class ExceptionHandelingDemo
	{
		public static void handleException(String a)
		{
			try {
				int x=Integer.parseInt(a);
				System.out.println("Length:"+a.length());
				
			}
			catch(NumberFormatException e)
			{
			System.out.println(e);
			}
			catch(NullPointerException e)
			{
				System.out.println(e.toString());
			}
			
		}
	}
	
	public class NullFormatAndNullPointerEcxeption 
	{

	public static void main(String[] args)
	
{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String a=sc.next();
		ExceptionHandelingDemo.handleException(a);
		
		
		sc.close();

	}
}
