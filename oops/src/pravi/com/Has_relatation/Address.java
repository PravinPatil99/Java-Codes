package pravi.com.Has_relatation;

public class Address 
{
	private String street;
	private String city;
	
	public Address(String street,String city)
	{
		super();
		this.street=street;
		this.city=city;
		}

	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	

}
