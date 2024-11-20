package Commandlineargument;

import java.util.Scanner;

public class EvenOdd1 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the any number");
		int num=sc.nextInt();
		
	if(num%2==0)
		{
			System.out.println("number even");
			
		}
		else 
			System.out.println("number is not even ");
		sc.close();
	}
}
