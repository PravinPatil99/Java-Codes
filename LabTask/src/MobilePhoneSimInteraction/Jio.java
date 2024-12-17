package MobilePhoneSimInteraction;

public class Jio implements SimCardInterface 
{
	private String  phonenumber;
	
	public Jio(String  phonenumber) {
		super();
		this.phonenumber = phonenumber;
		
				}

	@Override
	public void phoneNumber() 
	{
		System.out.println("phone number:"+this.phonenumber);
		

	}

	@Override
	public void networkProvider() 
	{
		
		System.out.println("network provide: JIO");

	}

	@Override
	public void activation() 
	{
		System.out.println(" jio sim ACtivation for number "+this.phonenumber);

	}

	@Override
	public void deativation() 
	{
		System.out.println("jio sim ACtivation for number "+this.phonenumber);
	}

}
