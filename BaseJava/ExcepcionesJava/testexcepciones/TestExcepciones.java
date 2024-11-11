package testexcepciones;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
	public static void main(String[] args) {
		int resultado = 0;
		// se usa el siguiente codigo para capturar las exception
		try {
		//resultado = 10/0;
		resultado = Aritmetica.division(10, 0);
		}catch(OperacionExcepcion e){ // con esto no muestra el error en consola
			System.out.println("Ocurrio un error de tipo OperacionExcepcion");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Ocurrio un error de tipo Exception");
			 e.printStackTrace(System.out);
			 System.out.println(e.getMessage());
		}
		finally { // se usa para cerrar recursos
			System.out.println("Se reviso la division entre cero");
		}
		System.out.println("resultado = " + resultado);  // sale error sin el codigo de TRY 
		// con el try simplemente imprime el valor de la variable
	}

}
