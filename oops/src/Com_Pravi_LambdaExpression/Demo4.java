package Com_Pravi_LambdaExpression;
/* If the input number is 0 or negative return -1
 * If the input number is even return square of the number
 * If the input number is even return cube of the number
 *  */

import java.util.Scanner;

@FunctionalInterface
interface calculator
{
	double squareAndCube(Integer num);
}
public class Demo4 
{

	public static void main(String[] args) 
	{
		calculator c=num->
		{
			if(num<=0)
			{
				
				return -1D;
			}
			else if(num%2==0)
			{
				Double y=Double.valueOf(num*num);
				return y;
			} else 
			{
				 Double z=Double.valueOf(num*num*num);
				return z;
			} 
			
		};
		Scanner Sc=new Scanner(System.in); 
		System.out.print("Enter the number:");
	     int num=Sc.nextInt();
		
		System.out.println(c.squareAndCube(num));
		
		Sc.close();

	}

}
