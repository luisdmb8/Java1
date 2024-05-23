package ejercicios;

import java.util.Scanner;

public class SistemaDeCalificacion {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el valor de la calificacion del 1 al 10:");
        //int valor = Integer.parseInt(scanner.nextLine());
        double valor = Double.parseDouble(scanner.nextLine());
        String calificacion = "Valor desconocida";
        
		if (valor >=9.0 && valor <10.0 ) {
			calificacion = "A";			
		}
		else if (valor >=8.0 && valor < 9.0 ) {
			calificacion = "B";			
		}
		else if (valor >=7.0 && valor < 8.0 ) {
			calificacion = "C";			
		}
		else if (valor >=6.0 && valor < 7.0 ) {
			calificacion = "D";			
		}
		else if (valor >=0.0 && valor < 6.0 ) {
			calificacion = "F";			
		}
		 
		System.out.println("Calificacion es = " + calificacion);
		
	}

}
