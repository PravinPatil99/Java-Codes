package pravi.com.Has_relatation;

public class ZomatoELc 
{
	

	public static void main(String[] args) 
	{
		Order1 o= new Order1(10030300,"Biryani",250);
		Customer c=new Customer(100087,"pravin patil","Amerpet hyderabad",o);
		System.out.println(c);

	}

}
