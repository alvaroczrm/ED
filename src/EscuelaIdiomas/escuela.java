package EscuelaIdiomas;

public class escuela 
{
	private String nombre;
	private int codigo;
	private String direccion;
	private alumno alumno1;
	private alumno alumno2;
	private alumno alumno3;
	
	public escuela() 
	{
		nombre = "";
		codigo = 0;
		direccion = "";
		alumno1 = new alumno();
		alumno2 = new alumno();
		alumno3 = new alumno();
	}
	public escuela(String n, int c, String d, alumno a1, alumno a2, alumno a3) 
	{
		nombre = n;
		codigo = c;
		direccion = d;
		alumno1 = a1;
		alumno2 = a2;
		alumno3 = a3;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public alumno getAlumno1() {
		return alumno1;
	}
	public void setAlumno1(alumno alumno1) {
		this.alumno1 = alumno1;
	}
	public alumno getAlumno2() {
		return alumno2;
	}
	public void setAlumno2(alumno alumno2) {
		this.alumno2 = alumno2;
	}
	public alumno getAlumno3() {
		return alumno3;
	}
	public void setAlumno3(alumno alumno3) {
		this.alumno3 = alumno3;
	}


	
}
