package oops;

public class Student 
{   private int   id;
	private String name;
	private String colleage;
	
	public Student(int id,String name,String colleage)
	{   
		this.id=id;
		this.name=name;
		this.colleage=colleage;
	}
	
     public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColleage() {
		return colleage;
	}

	public void setColleage(String colleage) {
		this.colleage = colleage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", colleage=" + colleage + "]";
	}

	}
