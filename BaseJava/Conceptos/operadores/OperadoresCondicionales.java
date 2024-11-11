package operadores;

public class OperadoresCondicionales {
	
	public static void main(String[] args) {
		
		int a = 8 ;
		int valorMinimo = 0 ;
		int valorMaximo = 10 ;
		
		boolean resultado = a >= 0 && a<=10 ; // Rango de valores de 0 a 10 AND 
		
		if (resultado) {
			System.out.println("Dentro del Rango");
		}
		else {
			System.out.println("Fuera del Rango");
		}
				
		boolean vacaciones = true;
		boolean diaDescanso = false;
		
		if (vacaciones || diaDescanso) // OR 
		{ 
			System.out.println("El padre puede asisitr al juego del hijo");
		}
		else {
			System.out.println("El padre NO puede asisitr al juego del hijo");
		}
		
		
	}
}
