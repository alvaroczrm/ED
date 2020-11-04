package Perros;

public class Perros2 
{ 
		private String raza;
		private String tamano;
		private int edad;
		private String color;
		
		public Perros2() 
		{
			raza = "";
			tamano = "";
			edad = 0;
			color = "";
		}
		public Perros2(String r, String t, int e, String c) 
		{
			raza = r;
			tamano = t;
			edad = e;
			color = c;
		}
	 
		public String getRaza() 
		{
			return raza;
		}
		public void setRaza(String r) 
		{
			raza = r;
		}
		public String getTamano() {
			return tamano;
		}
		public void setTamano(String t) 
		{
			tamano = t;
		}
		public int getEdad() 
		{
			return edad;
		}
		public void setEdad(int e) 
		{
			edad = e;
		}
		public String getColor() 
		{
			return color;
		}
		public void setColor(String c) 
		{
			color = c;
		}
}
