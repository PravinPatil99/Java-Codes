package Com_Pravi_LambdaExpression;

@FunctionalInterface
interface vehicle
{
	void run();
	
}

public class Demo1 {

	public static void main(String[] args) 
	{
		vehicle car=()->System.out.println("Car is running");
		car.run();
		
		
		vehicle Bike=()->System.out.println("Bike is running");
		
		Bike.run();
		
		vehicle bus=()->System.out.println("Bus is running");
		bus.run();			

	}

}
