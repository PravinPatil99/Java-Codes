package pravi.com.Has_relatation;

public class ChangeDriver {

	public static void main(String[] args)
	{
		
		Driver d=new Driver("john",30);
		Car1 c1=new Car1("Hyundai","Creata",2020,d);
	    Car1 c2=new Car1(c1);
		
	System.out.println("Original car info:\n");
	c1.displayInfo();
	System.out.println();
	
	System.out.println(" copied car detail:\n");
	c2.displayInfo();
	System.out.println();
	
	Driver driver2=new Driver("john",35);
	System.out.println("Original car detail:\n");
	c2.displayInfo();
	System.out.println();
	
	System.out.println(" copied car detail after changing  driver in the original car:\n");
	c2.displayInfo();
	
	
	
	
	
	}
	
	

}
