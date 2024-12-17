package Com_Pravi_LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface Calculate
{
	double doSum(double p, double q);
	
}
public class Demo2
{

	public static void main(String[] args) 
	{
		Calculate sum=(p,q)->p+q;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double p=Sc.nextDouble();
		System.out.println();
		System.out.println("Enter the value of b:");
		double q=Sc.nextDouble();
		
		System.out.println("Sum is:"+sum.doSum(p, q));
		
		
		Sc.close();
		

	}

}
