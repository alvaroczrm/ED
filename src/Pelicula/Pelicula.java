package Pelicula;

public class Pelicula 
{
	 private String titulo;
	 private int anyo;
	 private int duracion;
	 
	 public Pelicula()
	 {
		 titulo = "";
		 anyo = 0;
		 duracion = 0;
	 }
	 public Pelicula (String t,int a, int d) 
	 {
		 titulo = t;
		 anyo = a;
		 duracion = d;
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
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	 
}
