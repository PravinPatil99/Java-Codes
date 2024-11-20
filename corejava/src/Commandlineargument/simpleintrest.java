package Commandlineargument;

public class simpleintrest {
	public static void main(String[]args)
	{
		double principle=Double.parseDouble(args[0]);
		double rateofintrest=Double.parseDouble(args[1]);
		int time=Integer.parseInt(args[2]);
		
		
		double simpleintrest=(principle*rateofintrest*time)/100;
		System.out.println("simpleintrest is :"+simpleintrest);
		
		
	}
	

}
