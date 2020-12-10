package EscuelaIdiomas;

public class escuela 
{
	//Atributos
	private String nombre;
	private int codigo;
	private String direccion;

	//Creacion constructor para los constructores vacios
	public escuela() 
	{
		nombre = "";
		codigo = 0;
		direccion = "";
		
	}
	//Declaracion de los constructores por parametro
	public escuela(String n, int c, String d) 
	{
		nombre = n;
		codigo = c;
		direccion = d;
		

	}
	//Getters y Setters
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
	


	
}
