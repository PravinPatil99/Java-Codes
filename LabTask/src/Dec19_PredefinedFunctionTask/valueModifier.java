package Dec19_PredefinedFunctionTask;


import java.util.function.Consumer;

public class valueModifier {

	public static void main(String[] args) 
	{
		
		Consumer<String>c1=str->System.out.println("After converting string to uppercase:"+str.toUpperCase());
		c1.accept("Java ");
		
		Consumer<Integer>c2=num->System.out.println("After squaring the integer:"+num*num);
		c2.accept(7);
		
	}

}
