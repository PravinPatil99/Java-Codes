package com.pravi.Shallowcopy;

public class carElcdemo {

	public static void main(String[] args) 
	{
       car c1=new car("xuv","black", 1200000);
       System.out.println(c1);
       car c2=c1;
       c2.setCarClour("white");
       c2.setCarName("seddan");
       c2.setCarPrice(1500000);
      // System.out.println(c1);
       System.out.println(c2);
       
	}

}
