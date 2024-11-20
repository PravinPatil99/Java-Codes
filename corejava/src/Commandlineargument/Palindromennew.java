package Commandlineargument;

public class Palindromennew {
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
	 if(digit==num)
	 {
		 System.out.println(num +" palindrome");
		 
	 }
	 else {
		 System.out.println(num +" not palindrome");
		 
	 }
		
			 
 }

}
