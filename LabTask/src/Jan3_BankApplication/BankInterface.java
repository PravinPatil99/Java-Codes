package Jan3_BankApplication;

public interface BankInterface 
{
	
 void deposit(double amount)throws InvalidAmountException;
 void withdraw(double amount)throws InsufficientFundsException,InvalidAmountException;
 void transfer( BankAccountClass toAccount,double amount)throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
 void applyForLoan(double amount)throws LoanNotAllowedException, InvalidAmountException;
 double getBalance();
 

}
