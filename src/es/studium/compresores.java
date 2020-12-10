package es.studium;
import java.util.Scanner;
public class compresores {


	    public static void main(String[] args)
	    {
	        Scanner teclado = new Scanner(System.in);
	        float numero1, numero2;
	        System.out.println( "Dame un numero" );
	        numero1=teclado.nextFloat();
	        System.out.println( "Dame un numero" );
	        numero2=teclado.nextFloat();
	        teclado.close();
	        if(numero2==0)
	        {
	            System.out.println( "No se puede dividir");
	        }
	        else
	        {
	            System.out.println( "El resultado es " + (100-(numero1/numero2)*100));
	        }
	    }
	}
