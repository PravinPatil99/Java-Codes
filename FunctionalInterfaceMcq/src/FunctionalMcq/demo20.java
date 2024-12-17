package FunctionalMcq;

import java.util.function.Consumer;
import java.util.function.Function;

public class demo20 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println(a.toLowerCase());
		value.accept("NareshIT");
		
		Function<String, Integer> f=(String str)->str.indexOf("k");
	System.out.println(f.apply("Aniket"));
	}
}
