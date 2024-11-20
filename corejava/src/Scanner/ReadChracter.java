package Scanner;
import java.util.Scanner;
public class ReadChracter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ch :");
		char  gen=sc.next().charAt(0);
		System.out.println("The gen is :"+gen);
		
		sc.close();
		
		
	}

}
