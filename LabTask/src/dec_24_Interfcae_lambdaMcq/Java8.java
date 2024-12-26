package dec_24_Interfcae_lambdaMcq;
public class Java8 
{
	public static void main(String[] args) {
		Runnable r= () -> System.out.println("NareshIT");// modified 
		r.run();
	}
}

/*Answer:
Compile time error “Syntax error, insert "AssignmentOperator Expression" to complete Expression”. Lambda expressions always have to be assigned to a reference type of Functional Interafces.

 */

