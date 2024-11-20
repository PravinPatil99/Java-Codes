package com.pravi.inheritance;

class Employee
{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void work()
	{
		System.out.println(name+"is working");
	}
}
	class Manager1 extends Employee
	{
		String department;

		public Manager1(String name, double salary, String department) {
			super(name, salary);
			this.department = department;
		}
		
		void manage()
		{
			System.out.println(name+" is managing"+ department);
		}
	}
		public class Example3
		{
			public static void main(String[] args) {
				
				Manager1 m=new Manager1("Pravin",30000,"IT");
				m.work();
				m.manage();
			}
		}

		