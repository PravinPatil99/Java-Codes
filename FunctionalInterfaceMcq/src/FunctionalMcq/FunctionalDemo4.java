package FunctionalMcq;

interface Str 
{
String methodStr(String str);
}
public class FunctionalDemo4 {

	public static void main(String[] args)
	{
		Str str=(String s) -> "Indian";
		System.out.println(str.methodStr(""));

	}

}
