package FunctionalMcq;

@FunctionalInterface
interface NIT2
{
	String myInterface(String a);
	default void nit() 
	{
		
	}
	default int newInterface(int a) 
	{
		return a;
	}
	
}
