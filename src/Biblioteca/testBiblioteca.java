package Biblioteca;

public class testBiblioteca 
{

	public static void main(String[] args) 
	{
		/*nombre = n;
		apellidos = a;
		nacionalidad = na;*/
		Autor a1 = new Autor ("Federico","Garcia Lorca","España");
		Autor a2 = new Autor ("Gustavo Adolfo","Bécquer","España");
		Autor a3 = new Autor ("Luis","Gongora","España");
		/*titulo = t;
		autor = au;
		anyo = a;
		editorial = e;
		numPaginas = n;*/
		Libro l1 = new Libro ("Romancero gitano",a1,1928,"la atalaya", 250);
		Libro l2 = new Libro ("Desde mi celda",a2,1864,"galatea",816);
		Libro l3 = new Libro ("Soledades",a3,1613,"gouda",352);


	}

}
