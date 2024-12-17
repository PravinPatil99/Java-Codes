package FunctionalMcq;
@FunctionalInterface
interface Add1
{
	int mul(int b);
	
	}

public class FunctionalDemo3 
{
	public static void main(String[] args) 
	{
		int a=21;
		Add1 mul=b->b*b;
		System.out.println(mul.mul(a));
	}

}
