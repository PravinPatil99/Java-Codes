package com.pravi.Non19_task;

 class BankAccount 
{
protected int accountNumber;
protected double balance;

public BankAccount(int accountNumber,double balance)
{
	this.accountNumber=accountNumber;
	this.balance=balance;
}
public void deposit(double amount)
{
	if(amount>0)
	{
		System.out.println("deposited amount:"+balance+amount);
	}
	else
	
		System.out.println("Invalid input ");
	}
	
public void withdraw(double amount)
{
	if(amount<=balance)
	{
	System.out.println("withdraw:"+(balance-amount));
}
else 
	System.out.println("Invalid input");
}
}


class SavingAccount extends BankAccount
{
	protected double intrestRate;

	public SavingAccount(int accountNumber, double balance, double intrestRate) 
	{
		super(accountNumber, balance);
		this.intrestRate = intrestRate;
	}
	public void addIntrest()
	{
		double total=(balance*intrestRate/100);
		System.out.println("intrest in amount       :"+total);
		System.out.println("intrestAdded balance is :"+(balance+total));
		
	}
}


class CheckingAccount extends BankAccount
{
	protected double overDraftLimit;

	public CheckingAccount(int accountNumber, double balance, double overDraftLimit) 
	{
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	public void withdraw(double amount)
	{
	if(balance-amount<=overDraftLimit)
		{
			 double balance1=balance-amount;
			
			System.out.println("witdhraw amount:"+amount);
			System.out.println("new balance:"+balance1);
			}
		
		else {
			System.out.println("Exceeds overdraft Limit");
	}
	}
}





