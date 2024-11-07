package com.pravin.getter_setter;

public class Student
{
	private int studentID;
	private String studentName;
	private String studentCourse;
	private double courseFee;
	public Student(int studentID, String studentName, String studentCourse, double courseFee) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.courseFee = courseFee;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", courseFee=" + courseFee + "]";
	}
	
	
	
	

}
