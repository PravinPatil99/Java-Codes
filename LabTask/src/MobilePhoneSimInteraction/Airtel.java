package MobilePhoneSimInteraction;

public class Airtel implements SimCardInterface 
{
	private String phoneNumber;
	

	public Airtel(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	

	@Override
	public void phoneNumber() 
	{
		System.out.println("Phone number Airtel:"+this.phoneNumber);
	}

	@Override
	public void networkProvider() 
	{
		System.out.println("Network provider:Airtel");

	}

	@Override
	public void activation()
	{
		System.out.println("ACtivation ");

	}

	@Override
	public void deativation() 
	{
		System.out.println("deactivation");
	}

}
