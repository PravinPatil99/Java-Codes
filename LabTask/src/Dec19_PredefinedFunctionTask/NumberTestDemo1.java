package Dec19_PredefinedFunctionTask;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTestDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		Predicate<Integer> p1=num->num%2==0;
		
		System.out.println("is "+number+" is even?2"+p1.test(number));
		
		Predicate <Integer>p2=num->
		{
			
			if(num<= 1)
			{
				return false;
			}

			for(int i=2 ; i<=Math.sqrt(num);i++)
				
				if(num % i==0)
				{
					return false;
				}
			
			
		return true;
		};
System.out.println("is "+number+ " is prime?"+p2.test(number)); 
	sc.close();
	}

}
