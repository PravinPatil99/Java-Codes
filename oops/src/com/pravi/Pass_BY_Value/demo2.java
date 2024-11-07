package com.pravi.Pass_BY_Value;

public class demo2 {

	public static void main(String[] args) 
	{
		int x=100;
		x= accept(x);
		System.out.println(x);
	}
	public static int accept(int y)
	{
		y=200;
		return y;

	}

}
