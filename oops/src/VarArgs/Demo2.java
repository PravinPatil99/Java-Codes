package VarArgs;
class Hetro
{
	public void acceptHetro(int ...values)
	{
		int sum=0;
		for(int value:values)
		{
			
			sum=sum + value;
		}
		System.out.println(sum);
	}
}


public class Demo2 {

	public static void main(String[] args) 
	{
		Hetro h=new Hetro();
		h.acceptHetro(12,12);
		h.acceptHetro(33,78,89);
		

	}

}
