package SetA;

 class BankAccount 
{
	protected double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	public double deposit(double amount)
	{
	  double fbalance;
		System.out.println("Amount deposit:"+amount);
		System.out.println("After deposit:"+ (fbalance=balance+amount));
		return 0;
	}
	
	public double getBalance() {
		return balance;
	}
	public double withdraw(double amount)
	{
		double fbalance1;
		System.out.println("withdraw:"+(fbalance1=getBalance()-amount));
		System.out.println("Current balance after withdraw:"+fbalance1);
		
	return 0;
	}
	
	
}
 
 class SavingAccount extends BankAccount
 {
	 protected double intrestRate;

	public SavingAccount(double balance, double intrestRate) {
		super(balance);
		this.intrestRate = intrestRate;
	}
	 
	public void calcualteIntrest()
	{
		double intrest;
		System.out.println("intrest :+"+(intrest = getBalance() *intrestRate / 100));
		System.out.println(" saving account balance :"+((getBalance()+intrest)));
	}
 }
  class CheckingAccount extends BankAccount
  {
	public CheckingAccount(double balance) {
		super(balance);
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + "]";
	}

	  
	  
  }
 
