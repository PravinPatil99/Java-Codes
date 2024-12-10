package Dec06.LabTask;
class NIT3
{
	int a;
	public NIT3(int a) {
		this.a=a;
	}
	 int getNum()
	{
		 return   this.a;
	}
}
class NIT4 extends NIT3
{
	int a;
	public NIT4(int a,int b) 
	{
		super(a);
		this.a=b;
	}
	 int getVal()
	{
		return this.a;
	}
}
class OopsMCQ
{
public static void main(String[] args) 
{
	NIT4 nit = new NIT4(74,152);
	System.out.print(nit.getNum()+" "+nit.getVal());
	}
}
