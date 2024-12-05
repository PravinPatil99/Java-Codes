package VarArgs;

class Hetro1
{
	public void acceptHetro(Object... x)
	{
		for(Object y:x)
			System.out.println(y);
	}
	{
		
	}
}
public class Demo5 
{

	public static void main(String[] args)
	{
		Hetro1 h=new Hetro1();
		h.acceptHetro(12,12,2,2,"nit","pravin");
	}

}
