/*A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. Display total selling price, profit along with vat and service charge.

*/



package com.pravin.nit;

public class ShopkeeperBuysTv {

	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
      int  tvBuysPrice=32500;
      double sellingProfit=27;
      double vat=12.7;
     double serviceCharge=3.87;
     double totalSellingPrice= tvBuysPrice +(tvBuysPrice*sellingProfit/100);
     double tvat=(totalSellingPrice*vat/100);
     double tserviceCharge=(totalSellingPrice*serviceCharge/100);
     
     System.out.println(" vat :"+tvat);
     System.out.println("serviceCharge:"+tserviceCharge);
      System.out.println(" total selling price of tv  :"+ (totalSellingPrice+tvat+tserviceCharge));
      
      
     
      }

}
