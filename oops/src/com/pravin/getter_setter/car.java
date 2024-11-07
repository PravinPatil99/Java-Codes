package com.pravin.getter_setter;

public class car 
{
	private String carCompany;
	private String carName;
	private int carMillege;
	private double carPrice;
	
	public car(String carCompany, String carName, int carMillege, double carPrice) {
		super();
		this.carCompany = carCompany;
		this.carName = carName;
		this.carMillege = carMillege;
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "car [carCompany=" + carCompany + ", carName=" + carName + ", carMillege=" + carMillege + ", carPrice="
				+ carPrice + "]";
	}
	
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarMillege() {
		return carMillege;
	}
	public void setCarMillege(int carMillege) {
		this.carMillege = carMillege;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	
	public static car GetCarObj()
	{
		return new car("bmw","gls300",10,2500000);
		
	}

}
