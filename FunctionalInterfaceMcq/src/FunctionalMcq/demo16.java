package FunctionalMcq;
interface NIT6
{
	public int myInterface(int a);
}

public class demo16 {
	public static void main(String[] args) {
		NIT6 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
