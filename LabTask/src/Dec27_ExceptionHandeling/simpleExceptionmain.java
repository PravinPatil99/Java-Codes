package Dec27_ExceptionHandeling;

import java.util.*;
import java.util.Scanner;

public class simpleExceptionmain {

	public static void main(String[] args) 
	{
		Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Inside try");
			System.out.println("Enter the a:");
			
			String a=sc.next();
		    System.out.println("Enter the b:");
		    String b=sc.next();
		
		
		System.out.println("result is :"+a+ "and" +b);
		}
		
		catch(Exception e)
		{
			System.err.println("Inside catch block ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally executed");
		}
		
}

}
