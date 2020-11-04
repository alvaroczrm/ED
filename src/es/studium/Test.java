package persona;

public class Test
{

	public static void main(String[] args) 
	{
		Persona p1 = new Persona();
		p1.setNombre("Pablo");
		p1.setApellidos("Romero");
		p1.setEdad(21);
		p1.setHaPagado(true);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidos());
		System.out.println(p1.getEdad());
		System.out.println(p1.getHaPagado());
	}

	

}
