package n1exercici7SamayoaS;

import java.util.Arrays;
import java.util.List;

public class N1exercici7SamayoaS {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("enero", "2", "marzo", "abril",
				"5", "junio", "julio", "8", "septiembre", "octubre",
				"11", "diciembre");
		
				
		
		list.sort((b,a) -> Integer.compare(a.length(), b.length()));
		list.forEach(System.out::println);

	}

}
