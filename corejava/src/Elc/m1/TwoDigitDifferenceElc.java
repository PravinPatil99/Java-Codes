package Elc.m1;

import java.util.Scanner;

import Blc.m1.TwoDigitDifference;

public class TwoDigitDifferenceElc {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num>10 && num<100)
		{
		int diff=TwoDigitDifference.getDiffOfDigits(num);
		System.out.println("The difference is :"+diff);
		}
		else System.out.println("Numer in not two digit number");
				
		sc.close();

	}

}
