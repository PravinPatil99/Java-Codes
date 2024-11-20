package Scanner;
import java.util.*;
public class SwitchDemo {

	public static void main(String[] args) 
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  choice :");
	char color=sc.next().toLowerCase().charAt(0);
	
	switch(color)
	{
	case 'r':System.out.println("Red");break;
	case 'W':System.out.println("White"); break;
	case  'b':System.out.println("Blue"); break;
	default:System.out.println("no color");
	
	
	}
	System.out.println("completed");
	

	}

}
