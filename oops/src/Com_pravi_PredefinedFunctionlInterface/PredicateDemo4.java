package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo4 
{

	public static void main(String[] args) 
	{
		// verify my name or not
		
		Predicate <String> n1=name->name.equalsIgnoreCase("Pravin");
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=Sc.next();
		
		System.out.println("Are you  pravin "+n1.test(name));
		Sc.close();
		
		

	}

}
