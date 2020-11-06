package EscuelaIdiomas;

public class alumno 
{
	private String nombre;
	private String direccion;
	private asignatura asignatura;
	private double nota;
	
	public alumno() 
	{
		nombre = "";
		direccion = "";
		asignatura = new asignatura();
		nota = 0.0;
	}
	public alumno(String n, String d, asignatura a, double no) 
	{
		nombre = n;
		direccion = d;
		asignatura = a;
		nota = no;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
