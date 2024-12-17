package Com_Pravi_LambdaExpression;
@FunctionalInterface
interface Length
{
int getLength( String Str);
}
public class Demo3 
{

	public static void main(String[] args) 
	{
		Length len=str-> str.length();
		
		System.out.println("length:"+len.getLength("Indian"));
	}

}
