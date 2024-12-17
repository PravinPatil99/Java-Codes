package MobilePhoneSimInteraction;

public class BSNL implements SimCardInterface 
{
	private String  phoneNumber;
	
	public BSNL(String phoneNumber) 
	{
		super();
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void phoneNumber()
	{
		System.out.println("Phone number:"+this.phoneNumber);

	}

	@Override
	public void networkProvider() 
	{
		System.out.println("network provider is Bsnl");
	}

	@Override
	public void activation() 
	{
	System.out.println("activation");
	}

	@Override
	public void deativation()
	{
		System.out.println("deactivation");
	}

}
