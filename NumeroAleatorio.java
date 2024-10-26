/*
* Utilizando el método RANDOM diseñe un programa (en consola) que de números
* aleatorios desde 0 hasta el número que ingrese el usuario por teclado.
*/

package numeroaleatorio;

import java.util.Scanner;

public class NumeroAleatorio {
	public static void main(String[] args ) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Variables
		int numUno = (int)(Math.random() * 100);
		int numDos;
		
		//Solicitamos núumero a usuario
		System.out.println("Ingrese número");
		numDos = entrada.nextInt();
		
		//Operación
		numUno = numDos / 10;
		
		//Salida de programa
		System.out.println("El número aleatorio es: " + numUno);
		
		
	}

}
