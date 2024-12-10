package com.pravi.Exam;

public class CricketSimulator 
{

	public static void main(String[] args) 
	{
		
	Cricket c=new Cricket("Generic Match",true);
	System.out.println(c);
	c.getMatchDetails("Preparing for a generic cricket match...");
	
	TestMatch t=new TestMatch("5 days. No restrictions on overs.",false);
     System.out.println(t);
	t.getMatchDetails("Preparing for a Test Match...");
	
	ODIMatch  o=new ODIMatch("50 overs per side",true);
    System.out.println(o);
	o.getMatchDetails("Preparing for an ODI Match...");
	
	T20Match t1 =new T20Match("20 overs per side. High-intensity game.",true);
    System.out.println(t1);
	t1.getMatchDetails("Preparing for a T20 Match..");

	
	

	}

}
