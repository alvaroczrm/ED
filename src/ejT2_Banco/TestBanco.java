package ejT2_Banco;

public class TestBanco {
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente_ antonio = new Cliente_("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente_ beatriz = new Cliente_("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		/* Antonio y Beatriz consultan el saldo */
		consultaSaldo(cuentaAntonio);
		consultaSaldo(cuentaBeatriz);

		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		consultaSaldo(cuentaAntonio);
		consultaSaldo(cuentaBeatriz);

		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);

		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);

		/* Antonio transfiere 50€ a Beatriz */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		
		consultaSaldo(cuentaAntonio);
		consultaSaldo(cuentaBeatriz);
	}//main

	private static void consultaSaldo(Cuenta cuentaAntonio) {
		System.out.println("La cuenta de " + cuentaAntonio.getTitular().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
	}
}//cierre
