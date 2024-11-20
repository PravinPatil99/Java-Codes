package practicejava;

public class Hotelbill 
{

	public static void main(String[]args)
	{
		
       int amount=Integer.parseInt(args[0]);
       if(amount<=11000)
       {
    	  System.out.println("domestic bill");
    	  
       }
       else if(amount==20000)
       {
    	   System.out.println("servicing charge");
       }
       else if(amount>=30000)
       {
    	   System.out.println("home loan ");
       }
	}
}