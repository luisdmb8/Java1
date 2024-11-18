package sentencias_IF_ELSE_SWITCH;

import java.util.Scanner;


public class EjercicioCasesEstacion {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el numero del mes:");
        int mes = Integer.parseInt(scanner.nextLine());		
		String estacion = "Estacion desconocida";
		switch(mes){
			case 1: case 2: case 12:
				estacion = "Invierno";
			break;
			case 3: case 4: case 5:
				estacion = "Primavera";
			break;
			case 6: case 7: case 8:
				estacion = "Verano";
			break;
			case 9: case 10: case 11:
				estacion = "Otonio";
			break;
		}
		System.out.println("Estacion = " + estacion);
	}

}
