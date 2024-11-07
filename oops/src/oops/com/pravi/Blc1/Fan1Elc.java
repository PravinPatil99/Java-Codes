package oops.com.pravi.Blc1;

public class Fan1Elc 
{

	public static void main(String[] args) 
	{ 
		Fan fan= new Fan();
		
		fan.name="bajaj";
		fan.coil="copper";
		fan.wings=4;
		fan.butonon="fan satarted";
		fan.butonoff="fan not working";
		
		
		
		
		fan.on();
		System.out.println("=====================");
		fan.off();
		
	}


	}


