package T2;

public class refactorizar {

	public static void main(String[] args) {
		int numero = 3; //Refactor-convert local variable to field
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
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
