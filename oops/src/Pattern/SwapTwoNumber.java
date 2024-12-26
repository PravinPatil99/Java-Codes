package Pattern;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) 
	{
		//Swapping variable without using third variable.
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a:");
	int a=sc.nextInt();
	
	System.out.println("Enter the b:");
	int b=sc.nextInt();
	
	System.out.println("Before swapping:");
	System.out.println("a value:"+a);
	System.out.println("b value:"+b);
	System.out.println();
	System.out.println("After swapping:");
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value:"+a);
	System.out.println("b value:"+b);
	
	}

}
