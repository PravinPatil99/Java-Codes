package com.pravi.Blc1;

public class BankApplication
{
        static String BankName;
	private String CustomerName;
	private int    accountNumber;
	private int    holderIfscCode;
	static double accountBalance=1000;
	
	public BankApplication(String customerName, String CustomerName, int accountNumber, int holderIfscCode) {
		super();
		CustomerName = customerName;
		this.accountNumber = accountNumber;
		this.holderIfscCode = holderIfscCode;
	}






	@Override
	public String toString() {
		return "BankApplication [BankName=" + BankName + ", CustomerName=" + CustomerName + ", accountNumber="
				+ accountNumber + ", holderIfscCode=" + holderIfscCode + "]";
	}


	
	}
	


