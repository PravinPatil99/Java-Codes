package com.pravi_FunctionalProgramming;
@FunctionalInterface
interface Payment1
{
	void makePayment();
	
	
	default void m1()
	{
		
	}
	static void m2()
	{
		
	}
}
	public class Payment
	{
		public static void main(String[]args)
		{
			Payment1 creditCard =new Payment1() {
			
			@Override
			public void  makePayment()
			{
				System.out.println("Making payment through credit card");
			}
		};
		
		Payment1  debitcard= new Payment1()
				{
			
				@Override
			public void makePayment()
			{
				System.out.println("Making payment through debitcard");
			}
				};
				creditCard.makePayment();
				debitcard.makePayment();
		}
	}

/*
 * Annonmus inner class
 *  
 */
 
