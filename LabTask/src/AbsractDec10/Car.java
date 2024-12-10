package AbsractDec10;

 abstract  class Car
 {
       String brand;
       String model;
       int mileage;
      int topSpeed;
      int yearOfManufacturing;
   
	public Car() 
	{
		super();
	}
       public String  CarBrand(String brand )
       {
    	   this.brand=brand;
    	   return brand;
       }
       
      public String  carModel(String model)
      {
    	  this.model=model;
    	  return model;
      }
    	  public int carMileage(int mileage)
    	  {
    		  this.mileage=mileage;
    		  return mileage;
    	  }
      
    	  public int carTopSpeed(int topSpeed)
    	  {
    		  this.topSpeed=topSpeed;
    		  return topSpeed;
    	  }
    	  public int carYear(int yearOfManufacturing )
    	  {
    		  this.yearOfManufacturing=yearOfManufacturing;
    		  return yearOfManufacturing;
    	  }
    	  abstract void display();
    	  
 }
 
 