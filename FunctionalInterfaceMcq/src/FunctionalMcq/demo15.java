package FunctionalMcq;

import java.util.function.Predicate;

public class demo15
{
	public static void main(String[] args) 
	{
		String str[]= {"Java","Python","Naresh","IT"};
		
		Predicate<String> prediacte = p -> p.endsWith("va");
		for(String s: str) 
		{
			if(prediacte.test(s))
				System.out.println(s);
		}
	}
}
