package com.pravi.MethodOverloadingAmbugity;
class Test1
{
	public void  accept(short... s)
	{
		System.out.println("short:");
		
	}
	public void accept(char... s)
	{
		System.out.println("char:");
	}
}
public class AmbiguityDemo2 {

	public static void main(String[] args) 
	{
	Test1 t=new Test1();
	t.accept();

	}

}
