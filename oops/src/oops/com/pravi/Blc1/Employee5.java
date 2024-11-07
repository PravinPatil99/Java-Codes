package oops.com.pravi.Blc1;

public class Employee5 
{
	private String name;
	private int  age;
	private  String departent;
	private double salary;
	private String performance;
	
	public Employee5(String name, int age, String departent, double salary, String performance) {
		super();
		this.name = name;
		this.age = age;
		this.departent = departent;
		this.salary = salary;
		this.performance = performance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartent() {
		return departent;
	}

	public void setDepartent(String departent) {
		this.departent = departent;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	public void updateSalary()
	{
		if(performance=="good")
		{
			
			System.out.println("the salary after after added bonus:"+(salary+10000));
		}
		else if(performance=="average")
		{
			System.out.println("the salary after after added bonus"+(salary+5000));
			}
		else
		{
		System.out.println("performance is null no bonus will added");
		}
		
		
	}

	@Override
	public String toString() {
		return "Employee5 [name=" + name + ", age=" + age + ", departent=" + departent + ", salary=" + salary
				+ ", performance=" + performance + "]";
	}

}
