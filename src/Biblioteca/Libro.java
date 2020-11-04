package Biblioteca;

public class Libro 
{
	private String titulo;
	private Autor autor;
	private int anyo;
	private String editorial;
	private int numPaginas;
	
	public Libro() 
	{
		titulo = "";
		autor = new Autor();
		anyo = 0;
		editorial = "";
		numPaginas = 0;
		
	}
	
	public Libro(String t, Autor au, int a, String e, int n) 
	{
		titulo = t;
		autor = au;
		anyo = a;
		editorial = e;
		numPaginas = n;
	}

	public Autor getAutor() 
	{
		return autor;
	}

	public void setAutor(Autor a) 
	{
		this.autor = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	


}
