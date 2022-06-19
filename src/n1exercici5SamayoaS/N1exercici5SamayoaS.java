package n1exercici5SamayoaS;

public class N1exercici5SamayoaS {
	
	@FunctionalInterface
	interface getPiValue {
		Double pi();
	}

	public static void main(String[] args) {
	
		getPiValue ref;
		ref = () -> 3.1415;
		
		System.out.println(ref.pi());
	}
}
