package Scanner;
import java.util.*;
public class SwitchDemo2 
{
	public static void main(String[]args)
	{
		System.out.println("\t\t**main menu**\n");
		System.out.println("\t\t**100 Police**\n");
		System.out.println("\t\t**101 Fire**\n");
		System.out.println("\t\t**102 Ambulance**\n");
		System.out.println("\t\t**139 Railway**\n");
		System.out.println("\t\t**181 Women helpline**\n");
		
		System.out.println("Enter your choice :");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 100:System.out.println("Police services "); break;
		case 101:System.out.println("Fire Services"); break;
		case 102:System.out.println("Ambulance services"); break;
		case 139:System.out.println("Railway Services"); break;
		case 181:System.out.println("Women helpline"); break;
		default:
			System.out.println(" Services not available ");
		
		}
		System.out.println("Thank you  ");
		
	}
	

}
