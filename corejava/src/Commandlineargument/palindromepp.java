package Commandlineargument;

public class palindromepp {
	public static void main(String[]args)
	{
		int num=Integer.parseInt(args[0]);
		
		int n=num,r,digit=0;
		n=num;
		while(n!=0)
		{
		r=n%10;
		digit=digit*10+r;
		n=n/10;
		
		}
	if(digit==num)
	{
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("not palindromr");
	}
	

}
}
