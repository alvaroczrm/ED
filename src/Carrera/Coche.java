package Carrera;

public class Coche 
{

	private String fabricante;
	private String modelo;
	private int a�oFabricacion;
	private boolean gasolina;
	
	public Coche() 
	{
		fabricante = "";
		modelo = "";
		a�oFabricacion = 0;
		gasolina = false;
	}
	public Coche(String f, String m, int af, boolean g) 
	{
		fabricante = f;
		modelo = m;
		a�oFabricacion = af;
		gasolina = g;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�oFabricacion() {
		return a�oFabricacion;
	}
	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	public boolean isGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}

}
