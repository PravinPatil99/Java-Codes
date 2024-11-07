package oops.com.pravi.Blc1;

public class customer 
{
private double balance;

public void deposit(double amount)
{if(amount<=0)
{
	System.out.println("amount can't deposited");
	
}
else 
{
	this.balance=this.balance+amount;
	System.out.println("after deposite:"+this.balance);
}
	
}
public void  withdraw(double amount)
{
	this.balance=this.balance -amount;
	System.out.println("after withdraw:"+this.balance);
}
}
