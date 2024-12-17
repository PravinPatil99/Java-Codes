package FunctionalMcq;

@FunctionalInterface
interface cube
{
	int cube(int b);
}

public class FunctionalpDemo2 
{
	public static void main(String[] args) 
	{
		
		{
			int f=21;
		
		
			cube c=b->b*b*b;
		
		
		System.out.println("cube:"+c.cube(f));
		
		}
	}

}
