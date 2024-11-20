package com.pravi.inheritance;

public class Vehicle1
{
	private String brand;
	private int year;
	/**
	 * @param brand
	 * @param year
	 */
	public Vehicle1(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}
	
	public void VehicleDetails()
	{
		System.out.println("The brand of the vehicle:"+brand);
		System.out.println("The year the vehicle was manufactured:"+year);
	}
	
	class Motorcycle extends Vehicle1
	{
		private int Capacity;

		/**
		 * @param brand
		 * @param year
		 * @param capacity
		 * @param b 
		 */
		public Motorcycle(String brand, int year, int capacity, boolean b) {
			super(brand, year);
			Capacity = capacity;
		}
		public void startEngine()
		{
			
		}
		@Override
		public String toString() {
			return "Motorcycle [Capacity=" + Capacity + "]";
		}
		
		class sportMotocycle extends Motorcycle
		{
			private boolean raceMode;

			/**
			 * @param brand
			 * @param year
			 * @param capacity
			 * @param raceMode
			 */
			public sportMotocycle(String brand, int year, int capacity, boolean raceMode) 
			{
				super(brand, year, capacity, raceMode);
				this.raceMode = raceMode;
			}


			public void activeRaceMode()
			{
				System.out.println("race mode is :"+raceMode);
			}
			public void SportMotocycleDetails()
			{
			
			}
				
			@Override
			public String toString() {
				return "sportMotocycle [raceMode=" + raceMode + ", toString()=" + super.toString() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + "]";
			}
			


		

		}

		
			
		}
	}
	


