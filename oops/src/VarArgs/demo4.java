package VarArgs;
class Hetro7
{
	public void acceptHetro(Object... x)
	{
		for(Object y:x)
			System.out.println(y);
	}
	{
		
	}
}
public class demo4 
{

	public static void main(String[] args)
	{
		Hetro7 h=new Hetro7();
		h.acceptHetro(12,12,2,2,"nit","pravin");
	}

}
