package BankingSystemLosslyCoupleArc;

public class SBI implements BankInterface 
{	
	private double accountBalance;

	public SBI(double accountBalance) 
	{
		super();
		this.accountBalance = accountBalance;
		
		
			System.out.println("account balance initial balance:"+this.accountBalance);
			
	}
	
	@Override
	public void depositing(double amount)
	{
		if(amount<=0)
		{
			System.err.println("insuffiecient amount to deposite");
			System.exit(0);
		}
		else
			this.accountBalance=this.accountBalance+amount;
		
		System.out.println("depositig in SBI:"+amount);
		System.out.println("deposited " +amount+ " Rs and Balance is " +this.accountBalance +" rs");

	}

	@Override
	public void withdrawing(double amount) 
	{
		if(amount<=0)
		{
			System.err.println("insuffiecient amount to withdraw");
		
		}
	
			this.accountBalance=this.accountBalance-amount;
		System.out.println("withdraw in SBI: " + amount);
		System.out.println("withdraw " + amount +" Rs and Balance is " + this.accountBalance +"rs");

	}
		
	@Override
	public void checkingAccountBal() 
	{
		System.out.println("the final balnce in the SBi "+this.accountBalance+" rs");
	}

}
