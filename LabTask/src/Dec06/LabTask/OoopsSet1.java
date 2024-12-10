package Dec06.LabTask;

class NIT1
{
	public Object name;
	public Object name;

	public NIT1 (int name)
	{
		this.name=name;
	}
}
public class OoopsSet1 
{
public static void main(String[] args) 
{
NIT1 f1 = new NIT1(10);
NIT1 f2 = new NIT1(10);
NIT1 f3 = f2;
System.out.println(f1==f2);
System.out.println(f2==f3);
System.out.println(f1.name==f2.name);
System.out.println(f2.name==f3.name);
System.out.println(f1!=f3);
	

		}
}


/* eror
 */
 


