package MobilePhoneSimInteraction;

public class MobilePhone implements MobileInterface 
{
	private SimCardInterface simcard;

	@Override
	public void insertingSim(SimCardInterface sim ) 
	{
		
		System.out.println("inserting sim number with " );
		

	}

	@Override
	public void removingSim() 
	{
		System.out.println("removing sim");

	}

	@Override
	public void MakingCall(String phoneNumber) 
	{
		System.out.println("makiing class");
	}

	@Override
	public void sendingText(String phoneNumber,String meassge) 
	{
		System.out.println("sending text");

	}

}
