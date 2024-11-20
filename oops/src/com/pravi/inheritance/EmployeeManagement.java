package com.pravi.inheritance;

public  class EmployeeManagement
{
	 
		String name;
		int age;
		
		public void displayInfo()
		{
			
			System.out.println(name);
			System.out.println(age);
			}
 
		public EmployeeManagement(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}		 

}
 class Employee1 extends EmployeeManagement
{
		  String employeeId;
	public Employee1(String name, int age, String employeeId) {
				super(name, age);
				this.employeeId = employeeId;
			}

		public void displayEmployeeInfo()
		{
			super.displayInfo();
			System.out.println("Employee id is: "+ employeeId);
			
		}
}



class manager extends Employee1
		{
			String department;
	
		public void ManagerInfo()
		{
			super.displayEmployeeInfo();
			System.out.println("department is:"+department);
		}


 
		public manager(String name, int age, String employeeId, String department) {
			super(name, age, employeeId);
			this.department = department;
		}
		
	}


