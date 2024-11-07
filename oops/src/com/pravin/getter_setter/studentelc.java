package com.pravin.getter_setter;

public class studentelc 
{
public static void main(String[] args)
{
	Student s1=new Student(100, "pravin patil", "java full stack",30000);
	System.out.println(s1);
	
	System.out.println("After one year the fee of the course is ");
	
	s1.setCourseFee(s1.getCourseFee()+10000);
	System.out.println(s1);
	
	s1.setStudentName("pravii ");
	System.out.println(s1);
	  s1.setStudentCourse("data science");
	  System.out.println(s1);
	}

}
