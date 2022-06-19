package n1exercici8SamayoaS;

public class N1exercici8SamayoaS {
	
	@FunctionalInterface
	public interface Revers {
		String revers(String string);
	}

	public static void main(String[] args) {
		
		Revers ref = (str) -> {
			String result = " ";		
			int i = str.length()-1;
		while (i>=0) {
			result = result + str.charAt(i);
			i=i-1;
		}
		return result;
		};
		
		System.out.println(ref.revers("hola"));
	}

}
