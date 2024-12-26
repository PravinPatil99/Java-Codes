package Dec19_PredefinedFunctionTask;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGeneratorSupplier 
{

	public static void main(String[] args) 
	{
		
		Supplier<String>s1=()->1000+12000+"NITT"+20+20;
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->57;
		System.out.println(s2.get());
				

	}

}
