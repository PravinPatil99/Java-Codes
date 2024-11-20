package com.pravi.inheritance;

class person3 
{
	int age;
	String name;
	
	public person3(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "person3 [age=" + age + ", name=" + name + "]";
	}
}
class Student3 extends person3
{
	String course;

	public Student3(String name, int age, String course) {
		super(age, name);
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student3 [course=" + course + ", age=" + age + ", name=" + name + "]";
	}

}
public class Test2 {
    public static void main(String[] args) {
    	Student3 s = new Student3("Pravin", 22, "Java");
        System.out.println(s);
    }
}
