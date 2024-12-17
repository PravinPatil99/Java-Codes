package BankingSystemLosslyCoupleArc;

public class Customer  
{
	 public String name;
	
public Customer(String name)
{
		super();
		this.name = name;
		
		
		System.out.println("customer name:"+this.name);

		
	}



public class  CustomerC 
{

public static void accpetobj(BankInterface b)
{
	b.checkingAccountBal();
	b.depositing(0);
	b.withdrawing(0);
	
}
}
}
		





		
		
		
	


	
	


