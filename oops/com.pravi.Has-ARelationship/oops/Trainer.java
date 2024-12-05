package oops;
import java.util.*;
public class Trainer 
{
	public static void studentProfile(Student  obj )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id:");
		int id=sc.nextInt();
		
		if(id==obj.getId())
		{
			System.out.println(obj);
		}
		else 
			System.err.println("no such id of the student");
		sc.close();
	}

}
