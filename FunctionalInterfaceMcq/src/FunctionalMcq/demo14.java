package FunctionalMcq;

import java.util.function.Predicate;


public class demo14
{
	public static void main(String[] args) 
	{
		Predicate<Integer> grater = a -> a >15;
		
		Predicate<Integer> less = a -> a <10;
		
		boolean bool = grater.test(20);
		boolean bool1 = less.test(5);
		System.out.println(bool);
		System.out.println(bool1);		
		
	}
}
