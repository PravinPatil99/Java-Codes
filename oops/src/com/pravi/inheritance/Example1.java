/*1) create base class as Student

 Attribute :-
--------------

int studentId
string name
long mobile

define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- display
behavior:- this method will print the detail of student

-----------

create derived class name as JobGuaranteeStudent

 Attribute :-

boolean placementGuarantee


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-

method:-
---------
return type:-void
method name:- displayStudentInfo
behavior:- this method will print the detail of student and also placementGuarantee true or false

------------------------------

define Tester class here use main method to test  your logic
*/


package com.pravi.inheritance;

class Student 
{
	int studentId;
	String name;
	long mobile;
	
	public Student(int studentId, String name, long mobile) {
//		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}
	
	void display()
	{
		System.out.println("Student [studentId=" + studentId + ", name=" + name + ", mobile=" + mobile + "]");
	}
}

class JobGuaranteeStudet extends Student
{
	boolean palcementGuarantee;

	public JobGuaranteeStudet(int studentId, String name, long mobile, boolean palcementGuarantee) {
		super(studentId, name, mobile);
		this.palcementGuarantee = palcementGuarantee;
	}
	
	void displayStudentInfo()
	{
		System.out.println("Student [studentId=" + studentId + ", name=" + name + ", mobile=" + mobile + ", placementGuarantee="+palcementGuarantee+ "]");
	}
}

public class Example1 
{
	public static void main(String[] args) 
	{
		JobGuaranteeStudet job = new JobGuaranteeStudet(101,"Pravin Patil",123456789,true);
		job.display();
		job.displayStudentInfo();
	}
}
