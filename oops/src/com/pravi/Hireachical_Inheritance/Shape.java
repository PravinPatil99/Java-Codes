package com.pravi.Hireachical_Inheritance;

import java.text.DecimalFormat;

class Shape 
 {
	protected int x;
public Shape(int x)
{
	this.x=x;
	System.out.println("x value is :"+x);
	}
}

 class Circle extends Shape
 {
	 final double pi=3.14;
	 public Circle(int radius)
	 {
		 super(radius);
	 }
	 public void areaOfCircle()
	 {
		 double area=pi*x*x;
		 DecimalFormat df=new DecimalFormat("00.00");
		 System.out.println("Area of the circle:"+df.format(area));
	 }
 }
 
 class Rectangle extends Shape
 {
	 protected int breadth;
	 public Rectangle(int length,int breadth)
	 {
		 super(length);
		 this.breadth=breadth;
	 }
	 public void areaOfRectangle()
	 {
		 double area= super.x*this.breadth;
		 System.out.println("Area of rectangle:"+area);
		 
	 }
 }
 

