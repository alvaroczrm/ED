package Carrera;

public class Coche 
{

	private String fabricante;
	private String modelo;
	private int aņoFabricacion;
	private boolean gasolina;
	
	public Coche() 
	{
		fabricante = "";
		modelo = "";
		aņoFabricacion = 0;
		gasolina = false;
	}
	public Coche(String f, String m, int af, boolean g) 
	{
		fabricante = f;
		modelo = m;
		aņoFabricacion = af;
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
	public int getAņoFabricacion() {
		return aņoFabricacion;
	}
	public void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}
	public boolean isGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}

}
