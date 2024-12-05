package inheritance_exam_Task;

 class Staff 
 {
	 protected String name;
	 protected int id;
	
	public Staff(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}
	public void dispalyInfo()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
	}
	
	}

 
 class Faculty extends Staff
 {
	 protected String department;
	 
	 public Faculty(String name,int id,String department)
	 {
		 super(name,id);
		 this.department=department;
		}
	 public void teachSubject(int num)
	 {
		 System.out.println("faculty memebr:"+num);
		 }
	 }
 
 class Professor extends Faculty
 {
	 protected String researcharea;

	
	public Professor(String name, int id, String department, String researcharea)
	{
		super(name, id, department);
		this.researcharea = researcharea;
	}
	 
	public void  conductReasearch()
	{
		System.out.println("research area of the professor:"+ researcharea);
	}
	
	 
 }
 /*

SET A
-----------------------------------------------------------------------------------------------------------------------
Program 1 : ( 10 points )Multilevel Inheritance
-----------------------------------------------------------------------------------------------------------------------
University Staff Management System
You are tasked with creating a system that models university staff members, with multiple levels of staff positions. The system will represent different staff roles and their specific responsibilities.

Class Hierarchy:

Staff Class (Base Class)

Attributes:

String name: Represents the name of the staff member.
int id: Represents the unique ID of the staff member.

Methods:

Constructor to initialize the name and id attributes.

void displayInfo(): Prints the staff member's name and ID.

Faculty Class (Derived from Staff)

Attributes:
String department: Represents the department the faculty member belongs to.

Methods:
Constructor to initialize the name, id, and department.

void teachSubject(): Prints the department the faculty member is teaching.

Professor Class (Derived from Faculty)

Attributes:

String researchArea: Represents the research area of the professor.

Methods:

Constructor to initialize the name, id, department, and researchArea.

void conductResearch(): Prints the research area of the professor.

Task Requirements:

Define the Staff, Faculty, and Professor classes based on the attributes and methods described above.
Create a Main class that instantiates a Professor object with sample values (e.g., name, ID, department, and research area).
Call the methods to demonstrate the functionality of each class.

  */
 