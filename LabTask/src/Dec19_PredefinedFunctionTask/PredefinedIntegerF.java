package Dec19_PredefinedFunctionTask;

import java.util.Scanner;
import java.util.function.Function;

public class PredefinedIntegerF 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		Function<String,Integer> f1=str1->str.length();
       System.out.println("Length is of the String :"+f1.apply(str));
      
       System.out.println();
       
       System.out.println("Enter the number:");
      int  num=sc.nextInt();
       
       Function<Integer,Integer> f2=num1->num1/2;
       System.out.println("Result of dividing "+num+"by 2: "+f2.apply(num));
       sc.close();
       
       


}


}
