package T2;

public class geometria {

	private static final double pi = 3.14;

	public static void main(String[] args) {
		int radio = 13; // radio del círculo;
		 
		mostrarLongitud(radio);
 
		mostrarSuperficie(radio);
	}

	private static void mostrarSuperficie(int radio) {
		double superficie = pi * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}

	private static void mostrarLongitud(int radio) {
		double longitud = 2 * pi * radio;
		System.out.println("El perímetro del círculo es " + longitud);
	}

}
