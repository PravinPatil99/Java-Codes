package BankingSystemLosslyCoupleArc;

public class ICICI implements BankInterface 
{
	private double accountBalance; 
	
	public ICICI(double accountBalance) {
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
			System.out.println("Depositing in ICICI:"+amount);
		System.out.println("deposited "+amount+" Rs and Balance is "+this.accountBalance+" rs");

		
	}
	
	@Override
	public void withdrawing(double amount)
	{
		if(amount<=0)
		{
			System.err.println("insuffiecient amount to withdraw");
			System.exit(0);
		}
		else 
			this.accountBalance=this.accountBalance-amount;
			System.out.println("Depositing in ICICI:"+amount);
			System.out.println("withdraw "+amount+" Rs and Balance is "+this.accountBalance+" rs");

			

	}

	@Override
	public void checkingAccountBal() 
	{
		System.out.println("the final balnce in the ICICI"+this.accountBalance);

	}
	

}
