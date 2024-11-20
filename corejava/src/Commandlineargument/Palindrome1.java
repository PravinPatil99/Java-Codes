package Commandlineargument;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int n=num,r,digit=0;
		
		while(n!=0)
		{
			r=n%10;
			digit=digit*10*r;
			n=n/10;
		}
		//System.out.println(digit);
		if(digit==num)
		{
			System.out.println("number is plaindrome");
			
		}
		else 
			System.out.println("not palindrome");
sc.close();
	}

}
