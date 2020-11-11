package Biblioteca;

public class Autor 
{
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	
	public Autor() 
	{
		nombre = "";
		apellidos = "";
		nacionalidad = "";
	}
	public Autor (String n, String a, String na) 
	{
		nombre = n;
		apellidos = a;
		nacionalidad = na;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
