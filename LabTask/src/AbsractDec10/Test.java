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