package Commandlineargument;

public class Palindrome 
{
	public static void main(String[]args)
	{
		int num=Integer.parseInt(args[0]);
		int n=num,r,digit=0;
		while(n!=0)
		{
			r=n%10;
			digit=digit*10+r;
			n=n/10;
			}
		System.out.println(digit);
		if(digit==num)
		{
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not a palindrome");
					
		}
			
	}
	

}
