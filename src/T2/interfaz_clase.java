package T2;

public class interfaz_clase implements ejemplo {
	@Override 
	public double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n-1);
			return resultado;
		}
	}

}
// refactor- extract interface
/**public double calcularFactorial(double n) {
	if (n == 0) {
		return 1;
	} else {
		double resultado = n * calcularFactorial(n-1);
		return resultado;
	}
}*/