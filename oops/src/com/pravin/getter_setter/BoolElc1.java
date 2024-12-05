package com.pravin.getter_setter;
import java.util.*;

import oops.com.pravi.Blc1.Book;
public class BoolElc1
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the object");
		int noObj=sc.nextInt();
		
		for(int i=1;i<=noObj;i++)
		{
			Book b1=Book.setBookObj();
			System.out.println(b1);
			
		}
		sc.close();		
		
	}

}
