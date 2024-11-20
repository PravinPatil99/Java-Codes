package Scanner;
import java.util.*;
public class Season {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the season name :");
		String season=sc.next().toLowerCase();
		
		switch(season)
		{
		case "summer":System.out.println("It is summer Season!!");
		break;
		case "winter":System.out .println("it is winter !!!");
		break;
		case "rainy":System.out.println("It is rainy!!");
		break;
		}
		
		System.out.println("Enjoy the season");
	}
}


	
	
		