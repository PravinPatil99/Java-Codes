package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PerdicateDemo1 {

	public static void main(String[] args) 
	{
		//whether nu even or odd 
		Predicate<Integer> p1=num->num%2==0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		
		System.out.println("is "+num + " even number?:"+p1.test(num));
		Sc.close();

	}

}
