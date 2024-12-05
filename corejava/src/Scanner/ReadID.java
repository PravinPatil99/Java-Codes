package Scanner;
import java.util.Scanner;
public class ReadID 
{

	public static void main(String[]args)
	
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the emp name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the emp id:");
		String id=sc.next();
		
		
		System.out.println("The emp id :"+id);
		System.out.println("The emp name is :"+name);
		
		
		
		
	}
}
