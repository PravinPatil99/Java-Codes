package FunctionalMcq;
@FunctionalInterface
interface NIT7
{	
	int myInterface(int a);
}

@FunctionalInterface
interface NewInterface
{
	void alpha(String a);
}

public class demo17 {
	public static void main(String[] args) 
	{
		NIT7 nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}

