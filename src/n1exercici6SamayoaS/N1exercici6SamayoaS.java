package n1exercici6SamayoaS;

import java.util.*;

public class N1exercici6SamayoaS {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("enero", "2", "marzo", "abril",
				"5", "junio", "julio", "8", "septiembre", "octubre",
				"11", "diciembre");
		
				
		
		list.sort((a,b) -> Integer.compare(a.length(), b.length()));		
		list.forEach(System.out::println);
	}


	
}
