package operadores;

public class OperadorTernario {
	public static void main(String[] args) {
		
		// simplificacion de if / else 
		String resultado = ( 10 > 2) ? "verdadero": "falso" ; //  si 10 es mayor que 2 es verdadero si no es falso
		System.out.println(resultado);
		
		
		int numero = 8 ;
		resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
		System.out.println("resultado = " + resultado);
		
		
		
	}

}
