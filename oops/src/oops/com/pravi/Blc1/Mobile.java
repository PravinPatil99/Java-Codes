package oops.com.pravi.Blc1;

public class Mobile 
{    String mobileBrand;
	String mobileName;
    String mobileColour;
	int mobileRam;
	double mobilePrice;
	
	
	
	public void setMobiledetail(String mobileBrand, String mobileName,String mobileColour,int mobileRam)
	{
		this.mobileBrand=mobileBrand;
		this.mobileName=mobileName;
		this.mobileColour=mobileColour;
		this.mobileRam=mobileRam;
		
	}
	
	public void rateInfo()
	{
		if(mobileRam ==4)
		{
			mobilePrice=10000;
			}
		else if(mobileRam==8)
		{
			mobilePrice=15000;
			}
		else if(mobileRam==12)
		{
			mobilePrice=25000;
			
		}
		else if(mobileRam==16)
		{
			mobilePrice=30000;
		}
	}
		 
     
public void mobileData()
	{
		System.out.println("the mobileBrand is :"+mobileBrand);
		System.out.println("the mobile series Name is  :"+mobileName);
		System.out.println("the mobileColour is :"+mobileColour);
		System.out.println("the mobileRam  is   :"+mobileRam);
		System.out.println("the mobilePrice is :"+mobilePrice);
	
	
	}
}
