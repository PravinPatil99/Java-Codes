package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) 
	{
		//checking eligible for voting
		Predicate <Integer> n1=age->age>18;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		  int age=sc.nextInt();
		boolean isEligible=n1.test(age);
		if(isEligible)
		{
			System.out.print("Your is eligible for voting");
			
	}
		else
		{
			System.out.println("Yor not eligible for voting");
		}
		
		sc.close();
	}

	}
