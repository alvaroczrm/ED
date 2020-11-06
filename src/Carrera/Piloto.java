package Carrera;

public class Piloto 
{
	private String nombre;
	private String nacionalidad;
	
	public Piloto() 
	{
		nombre = "";
		nacionalidad = "";
	}
	public Piloto(String no, String na) 
	{
		nombre = no;
		nacionalidad = na;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

}
