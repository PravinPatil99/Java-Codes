package pravi.com.Has_relatation;

public class CustomerOrdersManagement
{

	public static void main(String[] args)
	{
		Order order = new Order("122345","laptop");
		customerClass c=new customerClass("james","james@example",order);
		System.out.println(c);
		
	}

}
