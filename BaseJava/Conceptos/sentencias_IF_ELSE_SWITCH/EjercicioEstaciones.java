package sentencias_IF_ELSE_SWITCH;

import java.util.Scanner;

public class EjercicioEstaciones {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el numero del mes:");
        int mes = Integer.parseInt(scanner.nextLine());
		String estacion="Estacion desconocida";
		
		if (mes ==1 || mes ==2 || mes == 12) {
			estacion = "Invierno";			
		}
		else if (mes ==3 || mes ==4 || mes == 5) {
			estacion = "Primavera";
		}
		else if (mes == 6 || mes ==7 || mes == 8) {
			estacion = "Verano";
		}
		else if (mes == 9 || mes ==10 || mes == 11) {
			estacion = "Otonio";
		}
		
		System.out.println("Estacion = " + estacion);
	}

}
