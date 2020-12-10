package EscuelaIdiomas;

public class alumno 
{
	//Atributos
	private String nombre;
	private String direccion;
	private asignatura asignatura;
	private double nota;
	private escuela escuela;
	
	//Declaracion del constructor para los constructores vacios
	public alumno() 
	{
		nombre = "";
		direccion = "";
		asignatura = new asignatura();
		nota = 0.0;
		escuela = new escuela();
	}
	public alumno(String n, String d, asignatura a, double no, escuela e) 
	{
		nombre = n;
		direccion = d;
		asignatura = a;
		nota = no;
		escuela = e;
	}
	//Getters y Setters
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
	public escuela getEscuela() {
		return escuela;
	}
	public void setEscuela(escuela escuela) {
		this.escuela = escuela;
	}
	
}
