package pravi.com.Has_relatation;

public class customerClass
{
	private String name;
	private  String email;
	private Order order;
	
	public customerClass(String name, String email, Order order) 
	{
		super();
		this.name = name;
		this.email = email;
		this.order = order;
	}

	@Override
	public String toString() {
		return "customerClass [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	

}
