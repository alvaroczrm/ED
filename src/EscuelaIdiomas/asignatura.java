package EscuelaIdiomas;

public class asignatura 
{
	//Atributos
	private String nombre;
	private int codigo;
	private String centro;
	
	//Constructores vacios
	public asignatura() 
	{
		nombre = "";
		codigo = 0;
		centro = "";
	}
	//Constructores por parametro
	public asignatura(String n, int co, String c) 
	{
		nombre = n;
		codigo = co;
		centro = c;
	}
	//Getters & Setters
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
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
}
