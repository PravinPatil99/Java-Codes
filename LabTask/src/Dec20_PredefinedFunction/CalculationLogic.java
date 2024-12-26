package Dec20_PredefinedFunction;
/*
 * 
 * 
 *Ques - 1
--------------
Question:

Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: ishat it tests the given number against the provided predicate and returns the result.

Define a sample integer number (e.g., 13).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

Test Cases:

Test case 1 : Sample Number (13):
13 is even: false
13 is greater than 10: true
13 is prime: true

Test Case 2:

For number1 = 6:
6 is even: true
6 is greater than 10: false
6 is prime: false

Test Case 3:
For number2 = 17:
17 is even: false
17 is greater than 10: true
17 is prime: tr
s
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {
	
	public static boolean testPredicate(int num, Predicate<Integer> p1)
	{
		return p1.test(num);
	}

	public static void main(String[] args) 
	{
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int num=sc.nextInt();
	   
	  Predicate<Integer>p1=num1->num1%2==0;
		System.out.println("Number "+num+ " is Even? :"+p1.test(num));
		
		System.out.println();
		
		System.out.println("Enter the grater than 10 number:");
		int num1=sc.nextInt();
		
		Predicate<Integer>p2=num2->num2>10;
		System.out.println("number grater than 10?:"+p2.test(num1));
		
		System.out.println();
		
		System.out.println("Enter the prime number:");
		int num2=sc.nextInt();
		
		Predicate<Integer>p3=num3->
		{
			if(num3<=1) 
				return false;
			for(int i=2;i<=Math.sqrt(num3);i++)
			{
				if(num3%i ==0)
					return false;
			}
			return true;
		};
		System.out.println("Enter the prime number:"+p3.test(num2));
		
}

}
