package com.pravi.dec11Task;

sealed interface AdvancedArithmetic permits mycal
{
	 abstract int divisorSum(int n);
	
}

 non-sealed class mycal implements AdvancedArithmetic
{
	 @Override
    public int divisorSum(int  n)
	{
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
				 sum+=i;
		 }
		 System.out.println(sum);
	return sum;
		}
	 

}

public class MyCalculator
{
public static void main(String[] args) 
	{
		mycal m=new mycal();
		
		m.divisorSum(28);
		
		
		
		

	}

}
