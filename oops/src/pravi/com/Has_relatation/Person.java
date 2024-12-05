package pravi.com.Has_relatation;

public class Person 
{
	private String name;
	private Address address;
	
	public Person(String name, Address address)
	{
		super();
		this.name = name;
		this.address = address;
		
	}
	public void displayInfo()
	{
		System.out.print("Address [name:"+name+"] ");
		System.out.println(address);
		} 
	
	
	
	
	

}
