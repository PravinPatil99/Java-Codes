package Elc.m1;

import java.util.Scanner;

import Blc.m1.Calculate;

public class Calculateelc 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		
	int number=Calculate.getSquareAndCube(num);
		System.out.println("result is  :"+number);
		sc.close();
		
	}

}
