package ejT2_Banco;

public class Cuenta {

	//atributos
	private int nCuenta;
	private int Saldo;
	private Cliente Titular;
	
	//Constructores vacios
	public Cuenta() {
		nCuenta = 0;
		Saldo = 100;
		Titular = new Cliente();
		
	}
	public Cuenta(int n, int s, Cliente t) {
		nCuenta = n;
		Saldo = s;
		Titular = t;
	}
	//Getters and Setters
	public int getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	public Cliente getTitular() {
		return Titular;
	}
	public void setTitular(Cliente titular) {
		this.Titular = titular;
	}
	
}
