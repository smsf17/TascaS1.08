package n1exercici3SamayoaS;

import java.util.ArrayList;

public class N1exercici3SamayoaS {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("enero");
		lista.add("febrero");
		lista.add("marzo");
		lista.add("abril");
		lista.add("mayo");
		lista.add("junio");
		lista.add("julio");
		lista.add("agosto");
		lista.add("septiembre");
		lista.add("octubre");
		lista.add("noviembre");
		lista.add("diciembre");
		
		lista.forEach(System.out::println);
	}
}
