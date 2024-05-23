package variables;

public class VariableEntera {
	public static void main (String args[]) {
		int miVariableEntera = 10;
		System.out.println(miVariableEntera);
		//Modificamos el valor de la variable
		miVariableEntera = 5;
		System.out.println(miVariableEntera);
		
		String miVariableCadena = "Saludos";
		System.out.println(miVariableCadena);
		
		miVariableCadena = "Adios";
		System.out.println(miVariableCadena);
		
		// var -inferencia de tipos de Java , cuando se instale JDK > 10 se puede usar var 
		
		int miVariableEntera2 = 15 ;
		System.out.println(miVariableEntera2);
		
		String miVariableCadena2 = "Nueva Cadena";
		System.out.println("miVariableCadena2 = " + miVariableCadena2);
		
		//Valores permitidos en el nombre de variables
		int miVariable = 1 ;
		int _miVariable = 2 ;
		int $miVariable = 3 ;
		
	}
}
