package oops.com.pravi.Blc1;

public class Bank 
{
	String bankName;
	String bankCustomerName;
	String bankAddress;
	int bankIFSCcode;
	int    customerAccountNumber;
	int    currentBalnace;
	
	
	public void setDetails1(String bankName,String bankCustomerName,String bankAddress,int bankIFSCcode, int customerAccountNumber, int currentBalnace )
	{
		this.bankName= bankName;
		this.bankCustomerName=bankCustomerName;
		this.bankAddress=bankAddress;
		this.bankIFSCcode=bankIFSCcode;
		this.customerAccountNumber=customerAccountNumber;
		this.currentBalnace=currentBalnace;
	}
	
	public void withdraw(double amount)
	{
     if(currentBalnace<1000)
    	  {
    	 System.out.println("Insufficient balance");
    	 }
     else if(currentBalnace - amount<1000)
     {
    	 System.out.println("maintain minimum balance");
    	 
    	}
     else {
    	 currentBalnace -=amount;
    	 System.out.println("Transcation sucessful ");
    	 System.out.println("Available balance is RS."+currentBalnace);
    	 	}
     
	}
     public void deposit(double amount)
     {
    	 double currentBalance = amount;
    	 
    		 System.out.println("deposited sucessfully");
    		 CurrentBalance();
    		 
    	 
    	 
     }
     public void CurrentBalance()
     {
    	 String currentBalance = null ;
		System.out.println("Available balance is:"+currentBalance);
    	 
     } 
     public void displayDetials()
     {
    	 System.out.println("bank name is :"+bankName);
    	 System.out.println("bankCustomerName is:"+bankCustomerName);
    	 System.out.println("bankAddress is:"+bankAddress);
    	 System.out.println("bankIFSCcode is:"+bankIFSCcode);
    	 System.out.println(" customerAccountNumber is:"+ customerAccountNumber);
    	 System.out.println(" currentBalnace is :"+ currentBalnace);
    	 
     }

	
		
	}
	

	
     
     
     
    	 
	
	


