package Jan3_BankApplication;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) 
	{
	 
		try
		{
			Scanner sc=new Scanner(System.in);
			BankAccountClass bank =new BankAccountClass(123456234,75000);
			BankAccountClass bank1 =new BankAccountClass(2323456,50000);
			
			CustomerClass c1=new CustomerClass("pravin patil",bank);
			CustomerClass c2=new CustomerClass("prasad patil",bank1);
		
		System.out.printf("Select an option :%n");
        System.out.printf("           1. Deposit%n");
        System.out.printf("           2. Withdraw%n");
        System.out.printf("           3. Transfer%n");
        System.out.printf("           4. Loan Application%n");
        System.out.printf("           5. Check Balance%n");
        System.out.printf("           6. Exit%n");
        
        System.out.println("Enter the choice");
         int choice=sc.nextInt();
         
        switch(choice)
        {
        case 1:
     System.out.println("Enter the deposit amount:");
        	double depositamount=sc.nextDouble();
        	c1.getAccount().deposit(depositamount);
        	
        	break;
        
        case 2:
        	
        	System.out.println("Enter the withdraw amount:");
        	double withdrawamount=sc.nextDouble();
        	c1.getAccount().withdraw(withdrawamount);
			
        	break;
        	
        case 3:
        	
        	System.out.println("Enter the transfer amount:");
        	double transferamount=sc.nextDouble();
        	c1.getAccount().transfer(c2.getAccount(), transferamount);


        	break;
        	
        case 4:
         System.out.println("Enter the laon amount:");
       double loanamount=sc.nextDouble();
       c1.getAccount().applyForLoan(loanamount);
        
        break;
        
        case 5:
        	
        	System.out.println("current balance:"+c1.getAccount().getBalance());
        	
        	break;
        	
        case 6:
        	System.exit(0);
        	
        	System.out.println("Exiting application. Goodbye!");
       break;
        default:
            System.out.println("Invalid option. Please try again.");
     
  }
		}
		catch(InsufficientFundsException | AccountNotFoundException | InvalidAmountException | LoanNotAllowedException e)
		{
			e.printStackTrace();
		}
	}
}
	
	

	
	

