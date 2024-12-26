package dec_24_Interfcae_lambdaMcq;

import java.util.function.Consumer;

public class Java89{
	public static void main(String[] args) {
	
		Consumer<String>b=(a)->System.out.println("NareshIT " + a+1);//modified
		b.accept("Hyderabad");

			

	}
}
/*
Answer:
Compile time error “Syntax error, insert "AssignmentOperator Expression" to complete Expression”. Lambda expressions always have to be assigned to a reference type of Functional Interafces.
*/