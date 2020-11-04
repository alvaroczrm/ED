package es.studium;

public class Test1
{

	public static void main(String[] args) 
	{
		Persona_ed p1 = new Persona_ed();
		p1.setNombre("Alvaro");
		p1.setApellidos("Cruz");
		p1.setEdad(23);
		p1.setHaPagado(true);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidos());
		System.out.println(p1.getEdad());
		System.out.println(p1.getHaPagado());
	}

	

}
