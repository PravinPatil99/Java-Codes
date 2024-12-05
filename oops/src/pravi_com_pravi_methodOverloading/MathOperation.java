package pravi_com_pravi_methodOverloading;

class Claculate
{
	
	public static void add(int num1,int num2)
	{
	  System.out.println("Sum of two:"+(num1+num2));
		
	}
	public static void add(double num1,double num2)
	{
		System.out.println("sum of two double:"+(num1+num2));
		}
	public static void multiply(int num1,int num2)
	{
		System.out.println("multiply of two number:"+(num1*num2));
		
	}
	public static void multiply(double num1,double num2)
	{
		System.out.println("multiply of two number:"+(num1*num2));
	}
	
}
public class MathOperation {

	public static void main(String[] args) 
	{
		Claculate.add(10.5,20.4);
		Claculate.multiply(10, 20);
		Claculate.add(-10, 20);
	}

}
