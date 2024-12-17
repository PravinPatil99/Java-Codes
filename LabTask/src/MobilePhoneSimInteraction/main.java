package MobilePhoneSimInteraction;

public class main {

	public static void main(String[] args) 
	{
	Jio jio= new Jio("9579421810");
	Airtel airtel=new Airtel("8080220658");
	BSNL bsnl=new BSNL("8329228567");
	
	MobilePhone mobile=new MobilePhone();
	mobile.insertingSim(jio);
	mobile.removingSim();
	mobile.MakingCall("9589039390");
	mobile.sendingText("9589039390", "hello");

	}

}
