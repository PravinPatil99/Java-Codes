package com.pravi.Shallowcopy;

public class Bike 
{
private String bikeName;
private String bikecolour;
private double bikePrice;

public Bike(String bikeName, String bikecolour, double bikePrice) {
	super();
	this.bikeName = bikeName;
	this.bikecolour = bikecolour;
	this.bikePrice = bikePrice;
}
public String getBikeName() {
	return bikeName;
}
public void setBikeName(String bikeName) {
	this.bikeName = bikeName;
}
public String getBikecolour() {
	return bikecolour;
}
public void setBikecolour(String bikecolour) {
	this.bikecolour = bikecolour;
}
public double getBikePrice() {
	return bikePrice;
}
public void setBikePrice(double bikePrice) {
	this.bikePrice = bikePrice;
}
@Override
public String toString() {
	return "Bike [bikeName=" + bikeName + ", bikecolour=" + bikecolour + ", bikePrice=" + bikePrice + "]";
}


}
