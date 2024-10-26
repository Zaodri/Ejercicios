package saludo;

import java.util.Scanner;

public class Saludo {
	
	public static void main(String [] args) {
		
	    
	    Scanner objeto = new Scanner (System.in);
        String mensajeUno = new String();
        String mensajeDos = new String();
        
        String nombre;
        
        mensajeUno = "Ingrese nombre";
        mensajeDos = "Bienvenid@"; 
        
        System.out.println(mensajeUno);
        nombre = objeto.next(); 
        		
        System.out.println("¡" + mensajeDos + " " + nombre + "! "); 
	}

}
