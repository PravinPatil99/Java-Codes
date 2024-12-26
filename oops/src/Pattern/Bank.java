package Pattern;

import java.util.Scanner;

class customer
{
	protected String custName;
	protected String bankname;
	protected int AcountNumber;
	protected String ifscCode;
	
	
	public customer(String custName, String bankname, int acountNumber, String ifscCode) {
		super();
		this.custName = custName;
		this.bankname = bankname;
		AcountNumber = acountNumber;
		this.ifscCode = ifscCode;
	}
	
}

class Bankdetail extends customer
{
	protected double accountBalance;
	
	public Bankdetail(String custName,String bankname,int AcountNumber,String ifscCode,double accountBalance)
	{
		super(custName,bankname,AcountNumber,ifscCode);
		this.accountBalance=accountBalance;
		this.AcountNumber=AcountNumber;
		this.bankname=bankname;
		this.ifscCode=ifscCode;
		this.custName=custName;
		
		
}
	
@Override
	public String toString() {
		return "Bankdetail [accountBalance=" + accountBalance + ", custName=" + custName + ", bankname=" 
				+ ", AcountNumber=" + AcountNumber + ", ifscCode=" + ifscCode + "]";
	}







public void depositAmount(int amount)
	{
	if(amount<=500)
	{
	   System.out.println("Amount must have greater than 500!!");
	   System.exit(0);
	}
	else
	{
	double deposit=this.accountBalance+amount;
	System.out.println("we have depostited in our account :"+amount);
	System.out.println("After depositing the accountBlance :"+deposit);
	System.out.println("Thank you");
		
	}
	}
	
	public void withDraw(int amount)
	{
		if(amount>=this.accountBalance)
		{
			System.err.println("Insufficient Balance");
		}
		else
		{
	     double withdraw=this.accountBalance-amount;
	     System.out.println("Withdraw amount:"+amount);
	     System.out.println("After successfull withdraw bank balance:"+withdraw);
	   
	     
		}
		
	}
	
}
public class Bank {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Bankdetail bank=new Bankdetail("Pravin patil","SBI",12345678,"sbi123",50000);
		System.out.println(bank);
		System.out.println("Enter you choice (1.withdraw) (2.deposit):");
		int choice=sc.nextInt();
		
		switch(choice)
		{
      case 1:
    	  System.out.println("Enter the deposit amount:");
    	  int amount=sc.nextInt();
    	  bank.depositAmount(amount);
    	  break;
    	  
		case 2:
			System.out.println("Enter the withdraw amount:");
			int amoun=sc.nextInt();
			bank.withDraw(amoun);
		break;
		
		}
		sc.close();
	
		

	}

	

}
