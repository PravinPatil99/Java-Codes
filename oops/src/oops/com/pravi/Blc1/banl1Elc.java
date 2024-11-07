package oops.com.pravi.Blc1;
import java.util.*;
public class banl1Elc {

	public static void main(String[] args) {
		Bank b1=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank name:");
		b1.bankName=sc.nextLine();
		
		System.out.println("Enter the bank customer name:");
		b1.bankCustomerName=sc.nextLine();
		
		System.out.println("Enter the bankAddress:");
		b1.bankAddress=sc.next();
		
		System.out.println("Ente the bankIFSCcode is:");
		b1.bankIFSCcode=sc.nextInt();
		
		System.out.println("  Enter customerAccountNumber is:");
		b1. customerAccountNumber=sc.nextInt();
		
		
		System.out.println("currentBalnace:");
		b1.currentBalnace=sc.nextInt();
		
		
		//b1.setDetails1();
		b1.withdraw(0);
		b1.deposit(200);
		b1.CurrentBalance();
		
		
		
		
 
	}

}
