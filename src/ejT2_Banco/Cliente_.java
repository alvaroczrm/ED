package ejT2_Banco;
/**
 * 
 * @author acr71
 *
 */
public class Cliente_ {

	//Atributos
	private String dni;
	private String Nombre;
	private String direccion;
	
	//Declaracion del constructor para los contructores vacios
	public Cliente_() {
		dni = "";
		Nombre = "";
		direccion = "";
	}
	public Cliente_(String d, String n, String di) {
		dni = d;
		Nombre = n;
		direccion = di;
	}
	//getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
