package Dec05.LabTask;

 class Account 
{
	protected String accountNumber;
	protected double balance;
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	public Account  generateStatement()
	{
		System.out.println("Account number:"+accountNumber);
		System.out.println("Current balance"+balance);
		
		return new Account (accountNumber,balance);
	}
	
}
 class SavingAccount extends Account
 {
	 protected double intrestRate;

	public SavingAccount(String accountNumber, double balance, double intrestRate) {
		super(accountNumber, balance);
		this.intrestRate = intrestRate;
	}
	
	public double getIntrestRate() 
	{
		return intrestRate;
	}

	@Override
	public  SavingAccount  generateStatement()
	{
		System.out.println("Saving account:\n");
		System.out.println("Account number:"+accountNumber);
		System.out.println("Current balance"+balance);
		System.out.println("intrest rate:"+intrestRate+"%");
		
		return  this;
	}
	 
	 
 }
 
 class CheckingAccount extends Account
 {
	 protected double overdraftLimit;

	
	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public  CheckingAccount  generateStatement()
	{
		System.out.println("Checking account info:\n");
		System.out.println("Account number:"+accountNumber);
		System.out.println("Current balance"+balance);
		System.out.println("Over draft limit:"+overdraftLimit);
		
		return this;
	}
	
 }
