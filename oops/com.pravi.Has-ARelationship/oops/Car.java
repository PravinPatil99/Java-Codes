package oops;

public class Car 
{
	private String carName;
	private int carModel;
	private Engine engine;
	
	public Car(String carName, int carModel) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine("battery",1200);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}
	
	

}
