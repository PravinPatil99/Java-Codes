package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class predicatedemo3 {

	public static void main(String[] args)
	{ // given name start with p or not
		Predicate<String> p1=str->str.equalsIgnoreCase("p");
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=Sc.next();
		
		System.out.println(name+"start with or not?"+p1.test(name));
		Sc.close();
		

	}

}
