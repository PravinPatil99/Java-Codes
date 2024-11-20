package Elc.m1;
import java.util.*;

import Blc.m1.TwoDigitsSum;
public class TwoDigitSum1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		
		
		int sum=TwoDigitsSum.getSumOfDigits(number);
			System.out.println("Two digit sum is :"+sum);
			sc.close();
			
		}
		
			
		
	}


