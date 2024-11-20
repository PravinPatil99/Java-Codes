package com.pravi.copyConstructor;

public class Student 
{
	private int studentId;
	private String studentName;
	
	public Student(Person student)
	{
		this.studentId=student.getPersonId();
		this.studentName=student.getPersonName();
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}
