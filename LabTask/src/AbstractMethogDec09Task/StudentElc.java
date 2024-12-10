package AbstractMethogDec09Task;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class StudentElc {

	public static void main(String[] args) 
	{
		
		ScienceStudent	s=new ScienceStudent("kiran","12th",70,80,78);
		System.out.println("name os Student:"+s.studentName);
		System.out.println("Student class:"+s.studentClass);
		System.out.println("percenatge:"+s.getPercentage());
		 System.out.println();
		
	
		
	HistoryStudent	h=new HistoryStudent("yash","12th",79,87);
	System.out.println("name os Student:"+h.studentName);
	System.out.println("Student class:"+h.studentClass);
	System.out.println("percenatge:"+h.getPercentage());
		 
		
		
	}

}
