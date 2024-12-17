package MobilePhoneSimInteraction;

public interface MobileInterface 
{
	void insertingSim(SimCardInterface sim);
	void removingSim();
	void MakingCall(String phoneNumber);
	void sendingText(String  number,String message);

}
