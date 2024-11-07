package com.pravi.Shallowcopy;

public class car 
{
	private String carName;
	private String  carClour;
	private double carPrice;
	public car(String carName, String carClour, double carPrice) {
		super();
		this.carName = carName;
		this.carClour = carClour;
		this.carPrice = carPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarClour() {
		return carClour;
	}
	public void setCarClour(String carClour) {
		this.carClour = carClour;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "car [carName=" + carName + ", carClour=" + carClour + ", carPrice=" + carPrice + "]";
	}
	
	

}
