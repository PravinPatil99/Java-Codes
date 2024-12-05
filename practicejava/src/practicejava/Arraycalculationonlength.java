/*
WAP in java to pass some value from command line argument based on the following criteria :

If the array length is 0 : It should print length is 0
If the array length is 1 : It should find the cube of the number
if the array length is 2 : It should print sum of the number
*/


package practicejava;

public class Arraycalculationonlength {

	public static void main(String[] args)
	{
		
		if(args.length==0)
		{
			System.out.println("length is 0");
			}
		else if (args.length==1)
		{
			int a=Integer.parseInt(args[0]);
			System.out.println("cub of the number:"+(a*a*a));
		}
		else if(args.length==2)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int sum=a+b;
			System.out.println("sum of the number is:"+(sum));
			
		}
	}

}
