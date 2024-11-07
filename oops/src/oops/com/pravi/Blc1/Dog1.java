package oops.com.pravi.Blc1;

public class Dog1 
{
public static void main(String[] args) 
	{
		Dog dolly = new Dog();
		
	dolly.height=5.6;
	dolly.age=3;
	dolly.name="pillu";
	dolly.type="germanshped";
	
	
	
	dolly.bark();
	dolly.crowd();
	dolly.getDogInformation();
	
	
	
	Dog german = new Dog();
	german.name="german";
	german.height=5.6;
	german.bark();
	System.out.println("=========================");
	
	german.crowd();
	german.bark();
	german.getDogInformation();
	
	
	
	}

}

	

	