package T2;

public class Extraer_Variable_Local {

	public static void main(String[] args) {
		int numero = 3;
		String texto = "El factorial de "; // pestaña refactor o shift+ctrl+L stract local variable
		System.out.println(texto + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println(texto + numero + " es " + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
