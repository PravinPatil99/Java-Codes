package Com_pravi_PredefinedFunctionlInterface;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerDemo3 {

	public static void main(String[] args) 
	{
		Consumer<Vehicle> v1=bike->System.out.print("Vehicle typee:"+bike);
		
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter the vehicle detail:");
		
		System.out.println("Enter the name of vehicle");
		String name=Sc.next();
		
		System.out.println("Enter the model of vehicle");
		String vModel=Sc.next();
		
		System.out.println("Enter th avg of vehicle");
		int vAvg=Sc.nextInt();
		
		System.out.println("Enter the price of vehicle");
		int price=Sc.nextInt();
		Sc.close();
		
		v1.accept(new Vehicle(vModel, vModel, price, price));

	}

}

class Vehicle
{
	private String  name;
	private String vModel;
	private int    VAvg;
	private double price;
	/**
	 * @param name
	 * @param vModel
	 * @param vAvg
	 * @param price
	 */
	public Vehicle(String name, String vModel, int vAvg, double price) {
		super();
		this.name = name;
		this.vModel = vModel;
		VAvg = vAvg;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", vModel=" + vModel + ", VAvg=" + VAvg + ", price=" + price + "]";
	}
	
}