package Elc.m1;

import java.util.Scanner;

import Blc.m1.NextMultipleOfHundred;


public class Test1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		int mul=NextMultipleOfHundred.getNextMultipleOfHundred(num);
		
		System.out.println("The multiplication is :"+mul);
		sc.close();
		

	}

}
