package Commandlineargument;

public class Fahrenenheit 
{
	public static  void main(String[]args)
	{
		float fahrenenhit = Float.parseFloat(args[0]);
		
		float celsius=((fahrenenhit-32)*5)/9;
		System.out.println(" celsius:"+celsius);		
	}

}
