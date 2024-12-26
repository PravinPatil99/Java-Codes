package dec_23_functional_interface;

import java.util.function.Consumer;

@FunctionalInterface
interface objectCreator
{
	Object create(int id, String name);

	}
public class Student
{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
 public void updateName(Consumer<String>nameUpdater)
  {
	  nameUpdater.accept(name);
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
  
}
