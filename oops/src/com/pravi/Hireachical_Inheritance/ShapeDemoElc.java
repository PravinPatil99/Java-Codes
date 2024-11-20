package com.pravi.Hireachical_Inheritance;

import java.util.Scanner;

public class ShapeDemoElc {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int radius=sc.nextInt();
		
		Circle  circle=new Circle(radius);
		circle.areaOfCircle();
		
		
		System.out.println("Enter the length of the lenght od radius :");
		int length=sc.nextInt();
		System.out.println("Enter the bradth of the rectangle:");
		int breadth=sc.nextInt();
		
		
		
		Rectangle rectangle = new Rectangle(length,breadth);
		rectangle.areaOfRectangle();
		sc.close();

	}

}
