package pravi.com.Has_relatation;

public class Car1
{
	private String brand;
	private String model;
	private int year;
	private Driver driver;
	
	public Car1(String brand, String model, int year, Driver driver) 
	{
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	public Car1(Car1 c) 
	{
		super();
		this.brand = c.brand;
		this.model =c.model;
		this.year = c.year;
		this.driver = c.driver;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void changeDriver(Driver driver)
	{
		this.driver=driver;
		
	}
	public void  displayInfo()
	{
		System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Driver Age: " + driver.getAge());
	}

	
	

}

