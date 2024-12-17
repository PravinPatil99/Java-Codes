package com_pravi_Dec12;

public class SimpleCalculator implements Calculator 
{

	@Override
	public void calculateSum(int... n) 
	{
		int sum=0;
		for(int numbers:n)
			sum+=numbers;
		System.out.print("sum of number:"+sum);
	}
	
	
		}


