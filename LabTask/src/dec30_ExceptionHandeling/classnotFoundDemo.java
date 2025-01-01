package dec30_ExceptionHandeling;

import java.util.Scanner;

public class classnotFoundDemo 
{
	public classnotFoundDemo(String classname)
	{
	Class<?> claz;
	try
	{
		claz=Class.forName(classname);
		
		System.out.println("Class name:"+claz);
		
	}
	catch(ClassNotFoundException e) 
	{
		System.out.println("Class not found Ecxeption occured"+e);
		e.printStackTrace();
	}
	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the class name:");
		String classname=sc.nextLine();
		
		new classnotFoundDemo(classname );
		
		sc.close();
		
	}

}
