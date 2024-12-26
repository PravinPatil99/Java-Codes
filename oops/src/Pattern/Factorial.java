package Pattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int num=sc.nextInt();
		 
		int  n=num;
		 int fact=1;
	while(num!=0)
	{
		fact*=num;
		num--;
		
	}
	System.out.println("factorial of "+n+" is "+ fact);

	sc.close();
	}
	

}
