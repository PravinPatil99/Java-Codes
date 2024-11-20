
/*Write a program to input the basic salary of a person. 
  He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance.
  The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument*/

package Commandlineargument;

public class Basicsalaryofperson 
{

	public static void main(String[] args) 
	{
	
		double basicsal=Double.parseDouble(args[0]);
		double hra=(basicsal*15)/100;
		double Conveyanceallowance=(basicsal*15)/100;
		double Entertainmentallowance=(basicsal*10)/100;
		double totalsal=(hra+Conveyanceallowance+Entertainmentallowance);
		
		System.out.println("Basic sal of the person :"+totalsal);
		 }

}
