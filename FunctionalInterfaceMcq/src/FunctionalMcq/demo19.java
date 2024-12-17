package FunctionalMcq;

import java.util.function.Consumer;

public class demo19 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println("Naresh I Technologies");
		value.accept("");
	}
}


