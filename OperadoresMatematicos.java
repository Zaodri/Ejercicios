/*
 * Mostrar por consola
 * suma, resta, multiplicación, 
 * división y módulo.
 */


package operadores;

public class OperadoresMatematicos {
	
	public static void main(String [] args) {
		
		//Atributos
		int numUno = 14;
		int numDos = 3;
		int result = 0;
		
		System.out.println("     ************************************");
		System.out.println("----  Operaciones aritméticas con el número 14 y el número 3 ------");
		
		/*Operaciones*/
		
		//Suma
		result = numUno + numDos;
		System.out.println("La suma de los números es: " + result);
		
		//Resta
		result = numUno - numDos;
		System.out.println("La resta de los números es: " + result);
		
		//Multiplicación
		result = numUno * numDos;
		System.out.println("La mltiplicación de los números es: " + result);
		
		//División
		result = numUno / numDos;
		System.out.println("La división de los números es: " + result);
		
		//Módulo
		result = numUno % numDos;
		System.out.println("El módulo es: " + result);		
	
		//Indicar si el número es mayor, menor o igual
		
		if(numUno > numDos) {
			System.out.println("El número " + numUno + " es mayor que el número " + numDos);
			if(numUno == numDos) {
				System.out.println("Los números son iguales" + (numUno == numDos));
			}
		}else {
			if(numUno < numDos)
				System.out.println("El número " + numUno + " es menor que el número " + numDos);			
			}
	
	}

	
}
