package dec_23_functional_interface;

import java.util.function.Consumer;

public class objectCreatorMain {

	public static void main(String[] args) 
	{
		objectCreator creator=(id,name)->new Student(id,name);
         Student student=(Student) creator.create(101, "Pravin");
         System.out.println("Initial Student detail:"+student);
         
         System.out.println("After updating");
         
         Consumer<String>nameUpdater=(cuurentName)->student.setName(cuurentName+"patil");
         student.updateName(nameUpdater);
         
         
         
         System.out.println("after updating:"+student);
         
	}

}
