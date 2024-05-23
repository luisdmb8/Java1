package primitivos;

import java.util.Scanner;

public class ConversionesTipos {
	public static void main(String[] args) {
		
		//Convertir tipo String a un tipo int	
		int edad = Integer.parseInt("20");
		System.out.println("edad= " + (edad+1));
		
		// Convertir tipo String a un tipo double
		double valorPi = Double.parseDouble("3.1416");
		System.out.println("valorPI= " + valorPi);
		
		// Operacion Scanner , pasando el argumento de la consola a entero 
		
		Scanner consola = new Scanner(System.in);
//		System.out.println("Proporciona tu edad: ");
//		edad = Integer.parseInt(consola.nextLine());
//		System.out.println("edad= " + edad);
		
		// Pasar de un int a String 
		
		String edadTexto = String.valueOf(10);
		System.out.println("edad en texto= " + edadTexto);
		
		// Pasar de String a Char , Hola H=0 , o=1 .... 
		
		char caracter = "Hola".charAt(1);
		System.out.println("caracter= " + caracter); // Imprimira  la o
		
		System.out.println("Proporciona un caracter: ");
		caracter = consola.nextLine().charAt(1); // El espacio del caracter que va a mostrar luego de colocarlo en consola
		System.out.println("caracter= " + caracter);
			
	}

}
