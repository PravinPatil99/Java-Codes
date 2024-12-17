
package BankingSystemLosslyCoupleArc;

import BankingSystemLosslyCoupleArc.Customer.CustomerC;

public class BakingSystemMain {

	public static void main(String[] args) 
	{
		
		
		
		Customer c=new Customer("pravin patil");
		System.out.println();
		
		SBI sbi=new SBI(10000);
		sbi.depositing(5000);
		System.out.println();
		sbi.withdrawing(3000);
		System.out.println();
		sbi.checkingAccountBal();
		
		System.err.println("--------------------------------------");
		
		Customer c1=new Customer("kiran shide");
		System.out.println();
		
		HDFC hdfc=new HDFC(30000);
		hdfc.depositing(10000);
		System.out.println();
		hdfc.withdrawing(3000);
		System.out.println();
		hdfc.checkingAccountBal();
		
		System.err.println("--------------------------------------");
		
		Customer c2=new Customer("Yash walke");
		System.out.println();
		
		ICICI ici=new ICICI(50000);
		ici.depositing(5000);
		System.out.println();
		ici.withdrawing(3000);
		System.out.println();
		ici.checkingAccountBal();
		
		
	}
}

