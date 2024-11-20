package com.pravi.Non19_task;

public class BankAccountElc {

	public static void main(String[] args) 
	{
		SavingAccount s =new SavingAccount(10000000,5000,5.3);
		System.out.println("\n saving account Info:\n");
		s.addIntrest();
		CheckingAccount c=new CheckingAccount(100000000, 30000, 3000);
		System.out.println("\nchecking Account inf0:\n");
		c.withdraw(1000);
		
	}

}
