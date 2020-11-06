package EscuelaIdiomas;

public class asignatura 
{
	private String nombre;
	private int codigo;
	private String centro;
	
	public asignatura() 
	{
		nombre = "";
		codigo = 0;
		centro = "";
	}
	public asignatura(String n, int co, String c) 
	{
		nombre = n;
		codigo = co;
		centro = c;
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
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
}
