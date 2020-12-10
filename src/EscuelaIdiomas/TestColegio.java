package EscuelaIdiomas;

public class TestColegio 
{

	public static void main(String[] args) 
	{
	//colegios
	escuela e1 = new escuela ("Escuela de ingles",75849,"Reyes catolicos, 14");
	escuela e2 = new escuela ("Escuela de frances",768594,"Cristobal colon,92");
	//asignaturas
	asignatura asig1 = new asignatura ("ingles B1", 75839, "Escuela de ingles" );
	asignatura asig2 = new asignatura ("frances B1", 86954, "Escuela de frances");
	asignatura asig3 = new asignatura ("ingles B2", 98754, "Escuela de ingles");
	asignatura asig4 = new asignatura ("frances A2", 64354, "Escuela de frances");
	//alumnos
	alumno al1 = new alumno ("Ana Abel", "Paseo de america,15", asig1, 7,e1);
	alumno al2 = new alumno ("Benito Bueno", "Reyes Catolicos,16", asig3, 6,e1);
	alumno al3 = new alumno ("Carmen Cano", "Reyes Catolicos,2", asig1, 5,e1);
	alumno al4 = new alumno ("Esteban Escalera", "Isabel la catolica,28", asig2, 9,e2);
	alumno al5 = new alumno ("Francisco Farfan", "Cristobal Colon,s/n", asig4, 8.5,e2);
	//colegio (metodo anterior)
	//escuela e1 = new escuela ("Escuela de ingles",75849,"Reyes catolicos, 14", al1, al2, al3);
	//escuela e2 = new escuela (); //Se introduce mediante este metodo porque por parametro tendriamos que introducir 3 alumnos y solo tenemos 2
	//e2.setNombre("Escuela de frances");
	//e2.setCodigo(768594);
	//e2.setDireccion("Cristobal colon,92");
	//e2.setAlumno1(al4);
	//e2.setAlumno2(al5);
	//Print
	System.out.println("La direccion de la "+e1.getNombre()+" es"+e1.getDireccion());
	System.out.println("La direccion de la "+e2.getNombre()+" es"+e2.getDireccion());
	System.out.println(al3.getNombre()+" esta matriculada en "+al3.getEscuela().getDireccion());
	System.out.println(al2.getNombre()+ " tiene de nota en la asignatura de "+al2.getAsignatura().getNombre()+ " un "+al2.getNota());

	}

}
