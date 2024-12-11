package com.pravi.AnonymusClass;

class super1
{
	public void show()
	{
		System.out.println("Show method suoer");
		
	}
	}
public class Super
{
	public static void main(String[]args)
	{
		super1 s=new super1()
				{
			@Override
			public void show()
			{
				System.out.println("Sub class show method");
				
			}
			
			};
		s.show();
	}
}
