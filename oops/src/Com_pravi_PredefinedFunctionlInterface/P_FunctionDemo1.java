package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Function;

public class P_FunctionDemo1 {

	public static void main(String[] args) 
	{
		Function<Integer,Integer>f1=num->num*num*num;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		System.out.println("cube of "+num+" is "+f1.apply(num));

		sc.close();
	}

}
