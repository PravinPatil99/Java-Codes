package com.pravi.multillevelInheritance;

 class Bank
{
	 protected String bankName;
	 protected String brachName;
	public static  String ifsCode;
	
	public Bank(String bankName, String brachName) 
	{
		super();
		this.bankName = bankName;
		this.brachName = brachName;
	}
	
	public void withdraw(double amount )
	{
		System.out.println("withdraw:"+amount);
		
	}
	public void deposit(double deposit)
	{
		System.out.println("deposit:"+deposit);
	}
	
	public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) 
	{
		return false;
	
	}

	public double loan(double amount,int year)
	{
		return 0;
	}
	
}
 
 
 class Axis extends Bank
 {
	 private double intrestRate;

	public Axis(String bankName, String brachName, double intrestRate) {
		super(bankName, brachName);
		this.intrestRate = intrestRate;
	}
	@Override
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			System.out.println("withdrawl from axis bank:"+amount);
		}
		else 
		{
			System.out.println("Invalid withdrawl amount");
		}
		@Override
		public void deposit(double amount)
		{
			if(amount>0)
			{
				System.out.println("deposit"+amount);
			}
			else 
			{
				System.out.println("Invalid deposit amaount");
			}
			
			public  boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount)
			{
				
				
			}
			
		}
 }
 }
