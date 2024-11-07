package com.pravi.Shallowcopy;

public class Laptop 
{
 private String laptopName;
 private double laptopPrice;
public Laptop(String laptopName, double laptopPrice) {
	super();
	this.laptopName = laptopName;
	this.laptopPrice = laptopPrice;
}
public String getLaptopName() {
	return laptopName;
}
public void setLaptopName(String laptopName) {
	this.laptopName = laptopName;
}
public double getLaptopPrice() {
	return laptopPrice;
}
public void setLaptopPrice(double laptopPrice) {
	this.laptopPrice = laptopPrice;
}
@Override
public String toString() {
	return "Laptop [laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + "]";
}
 
 }
