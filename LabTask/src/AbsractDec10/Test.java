package AbsractDec10;

class Test extends Car
{
	 @Override
	 public void display()
	 {
		 System.out.println("Brand:"+brand);
		 System.out.println("model:"+model);
		 System.out.println("Mileage:"+mileage);
		 System.out.println("topSpeed:"+topSpeed);
		 System.out.println("yearOfManufacturing:"+yearOfManufacturing);
	 
	}
	 
	 public static void main(String[] args) 
		{
			Test t1=new Test();
			t1.CarBrand("Scorpio s11 top model");
		    t1.carModel("2024 ");
			t1.carMileage(15);
			t1.carTopSpeed(140);
			t1.carYear(2024);
			t1.display();
			
		}
}

/*
Program 1:
----------
We have a class named as Car and it is abstract class we need to implement abstract method in 
sub class named as Test
For abstract class Car 
Instance Variables:
brand : String default
model : String default
mileage : int default
top_speed : int default
yearOfManufacturing : int default
Methods:
No Argument Constructor
carBrand() : String : It return brand of the car by using brand variable so initialize brand variable and return it.

carModel() : String : It return model of the car by using model variable so initialize model variable and return it.

carMileage() : int : It return mileage of the car by using mileage variable so initialize mileage variable and return it 

carTopSpeed() : int : It return topspeed of the car by using top_speed variable so initialize top-speed variable and return it 

carYear() : int : It return year of manufacturing of the car by using yearOfManufacturing 

variable so initialize yearOfManufacturing variable and return it
display() : void : abstract : This is abstract method to implement in 

sub class
Create a sub class of Car called as Test
Methods:
@Override
display(): void : It print all the details of parent class
This class having main method to test the solutions of parent class*/