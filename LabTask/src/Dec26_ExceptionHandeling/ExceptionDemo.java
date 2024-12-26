package Dec26_ExceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the a :");
			int a=sc.nextInt();
			
			System.out.println("Enter the b:");
			int b=sc.nextInt();
			
		System.out.println("you enetred a= "+a+ "and b="+b);
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
