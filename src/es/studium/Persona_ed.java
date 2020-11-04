package es.studium;

public class Persona_ed
{
	  private String nombre;
	  private String apellidos;
	  private int edad;
	  private boolean haPagado;
	  
	  public Persona_ed () { /*constructor por defecto*/
		    nombre = "";
		    apellidos = "";
		    edad = 0;
		    haPagado = false;
	  }
	  public Persona_ed (String n, String a, int e, boolean h) /*constructor por parametros*/
	  {
		  	nombre = n;
		    apellidos = a;
		    edad = e;
		    haPagado = h;
	  }
	  /*método*/
	  public String getNombre() { /*para mostrar el nombre*/
		  return nombre;
	  }
	 
	  public void setNombre(String n) { /*para introducir el nombre*/
		  nombre = n;
	  }
	 
	  public String getApellidos() {
		  return apellidos;
	  }
	 
	  public void setApellidos(String a) {
		  apellidos = a;
	  }
	 
	  public int getEdad() {
		  return edad;
	  }
	 
	  public void setEdad(int e) {
		  edad = e;
	  }
	 
	  public boolean getHaPagado() {
		  return haPagado;
	  }
	 
	  public void setHaPagado(boolean h) {
		  haPagado = h;
	  }
	                
}