package T2;

public class extraer_metodo {

	public static void main(String[] args) {
		int numero = 3;		
	    extracted(numero);

	}

	private static void extracted(int numero) {
		int contador = 1;
	    double resultado = 1;
	    while (contador <= numero) {
	    	resultado = resultado * contador;
	    	contador++;
	}
	}
}
/*int numero = 3;		
    int contador = 1; //desde aqui, refactor- extract method
    double resultado = 1;
    while (contador <= numero) {
    	resultado = resultado * contador;
    	contador++;*/