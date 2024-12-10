package Dec06.LabTask;
class NIT5
{
	static int a=90;
	String object;
	public NIT5(String name) 
	{
		this.object=name;
		NIT5.this.a+=1;
	}
	static int get_counter()
	{
		return NIT5.a;
	}
}

public class OopsTest3
{
	public static void main(String[] args) {
		NIT5 nit = new NIT5("nit");
		NIT5 nit1 = new NIT5("nit");
		NIT5 nit2 = new NIT5("nit");
		NIT5 nit3 = new NIT5("nit");
		NIT5 nit4 = new NIT5("nit");
		NIT5 nit5 = new NIT5("nit");
		NIT5 nit6 = new NIT5("nit");
		NIT5 nit7 = new NIT5("nit");
		System.out.println(NIT5.get_counter()-91);
	}
}
