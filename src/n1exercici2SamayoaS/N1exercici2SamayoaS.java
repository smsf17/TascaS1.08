package n1exercici2SamayoaS;

import java.util.ArrayList;

public class N1exercici2SamayoaS {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("coche");
		lista.add("avion");
		lista.add("papel");
		lista.add("mesa");
		lista.add("botella");
		
		ArrayList<String> palabrasO = buscarPalabras(lista);
		palabrasO.forEach((palabra)-> {System.out.println(palabra);});
		
		//lista.forEach((n)->{if(n.contains("o") && n.length()>5) System.out.println(n);});
	
	}
	
	public static ArrayList<String> buscarPalabras(ArrayList <String> lista) {
		ArrayList<String> nuevaLista = new ArrayList<String>();
		
		lista.forEach((n)->{if(n.contains("o") && n.length()>5) nuevaLista.add(n);});
		
		return nuevaLista;
	}

}
