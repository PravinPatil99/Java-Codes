package Dec06.LabTask;

class oop
{
	static int a=90;
	String object;
	public oop(String name) {
		this.object=name;
		oop.this.a+=1;
	}
	static int get_counter()
	{
		return oop.a;
	}
}

public class OopsTest4
{
	public static void main(String[] args) {
		oop nit = new oop("nit");
		oop nit1 = new oop("nit");
		oop nit2 = new oop("nit");
		oop nit3 = new oop("nit");
		oop nit4 = new oop("nit");
		oop nit5 = new oop("nit");
		oop nit6 = new oop("nit");
		oop nit7 = new oop("nit");
		System.out.println(oop.get_counter()-91);
	}
}
