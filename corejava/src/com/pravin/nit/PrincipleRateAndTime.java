/*Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.
*/

package com.pravin.nit;

public class PrincipleRateAndTime {

	public static void main(String[] args) {
	int principle=Integer.parseInt(args[0]);
	double rate=Double.parseDouble(args[1]);
	int time=Integer.parseInt(args[2]);
	double simpleintrest=(principle*rate*time)/100;
	int amount=principle;
	double trate=rate;
	int Time= time;
	
	System.out.println("the amount :"+amount);
	System.out.println("the rate :"+trate);
	System.out.println("simple intrest and amount:"+simpleintrest);
	System.out.println("The total amount :"+ amount*simpleintrest);
	
	}


	}

