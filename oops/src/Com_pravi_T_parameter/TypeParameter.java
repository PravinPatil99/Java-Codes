package Com_pravi_T_parameter;

class Accept<T>
{
	private T data;

	public Accept(T  data) {
		super();
		this.data = data;
	}
	public T getData()
	{
		return data;
	}
	
}
public class TypeParameter {

	public static void main(String[] args) 
	{
		Accept<Integer> acceptint=new Accept<Integer>(120);
		System.out.println(acceptint.getData());
		
		Accept<Double> acceptdouble=new Accept<Double>(12.00);
		System.out.println(acceptdouble.getData());
		
		Accept<Boolean> acceptboolean=new Accept<Boolean>(true);
		System.out.println(acceptboolean.getData());
		
		

	}

}
