package oops;

public class Customer 
{
	private String name;
	private String adress;
	private Order order;
	
	public Customer(String name,String adress)
	{
		this.name=name;
		this.adress=adress;
		this.order=new Order("biryani",123456);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", adress=" + adress + ", order=" + order + "]";
	}
	
	
	

}
