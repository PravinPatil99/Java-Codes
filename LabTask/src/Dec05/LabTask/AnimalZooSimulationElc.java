package Dec05.LabTask;

public class AnimalZooSimulationElc {

	public static void main(String[] args) 
	{
		Mammal m=new Mammal("lion", false);
		m.makeSound();
		m.reproduce();
		m.nurseYoung();
		System.out.println("----------");
		
		Bird b=new Bird("Eagle",true);
		b.makeSound();
		b.reproduce();
		b.buildNest();
		

	}

}
