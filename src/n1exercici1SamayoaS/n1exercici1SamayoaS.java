package n1exercici1SamayoaS;

import java.util.ArrayList;

public class n1exercici1SamayoaS {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("coche");
		lista.add("avion");
		lista.add("papel");
		lista.add("mesa");
		lista.add("botella");
		
		ArrayList<String> palabrasO = buscarPalabras(lista);
		palabrasO.forEach((palabra)-> {System.out.println(palabra);});
		
		//lista.forEach((n)->{if(n.contains("o")) System.out.println(n);});
	
	}
	
	public static ArrayList<String> buscarPalabras(ArrayList <String> lista) {
		ArrayList<String> nuevaLista = new ArrayList<String>();
		
		lista.forEach((n)->{if(n.contains("o")) nuevaLista.add(n);});
		
		return nuevaLista;
	}

}
