package Jan3_BankApplication;



public class BankAccountClass implements BankInterface

{
	private long accountNumber;
	private int  balance;
	
	

	public BankAccountClass(long accountNumber, int balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
		

	@Override
	public void deposit(double amount) throws InvalidAmountException
	{
		if(amount<=0)
		{
			throw new  InvalidAmountException("Deposit amount must be greater than zero.");
		}
		else
			
		{
			System.out.println("amount deposited sucessfully..!");
			System.out.println("Deposit account:"+amount);
			System.out.println("Account balance :"+(this.balance+amount));
		}
	
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new  InsufficientFundsException(" sorry..!!withdraw amount must be grater than 0");
		}
		else if(amount>this.balance)
		{
			throw new InvalidAmountException("Insufficient funds for withdrawal.");
		}
		else
		{
			System.out.println("Withdraw sucessfully..!!");
			System.out.println("withdraw amount is :"+amount);
			System.out.println("Balance is:"+(this.balance-amount));
		}
		
	}
	@Override
	public void transfer(BankAccountClass toAccount,double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException
	{
		if(amount>this.balance)
		{
			throw  new InsufficientFundsException("Insufficient funds for transfer.");
		}
		else if(toAccount== null)
			
		{
			throw new AccountNotFoundException("transfer account Account not found..!!");
			
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("transfer amount must be greater than o..!");
			}
		
		 this.withdraw(amount);
	        toAccount.deposit(amount);
	    }
		
	
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException
	{
	
		if(amount>50000 || balance<50000)
		{
			throw new LoanNotAllowedException("Loan amount exceeds the allowed limit or balance is insufficient.");
			
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("loan amount must be greater than o..!");
		}
		else
		{
			System.out.println("loan approved of:"+amount);
		}
	}
		@Override
		public double getBalance()
		{
			return balance;
			
	}
		public long accountNumber()
		{
			return accountNumber;
		}
		
		
		
	
	

}
