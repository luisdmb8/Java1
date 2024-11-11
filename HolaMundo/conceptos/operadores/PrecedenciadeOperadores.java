package operadores;

public class PrecedenciadeOperadores {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = ++x + y--; // x = 6 y y = 10 , el resultado es de izquiera a derecha 
		
		System.out.println("x = " + x);
		System.out.println("y = " + y); // aqui valdra 9 ya que es el decremento pendiente 
		System.out.println("z = " + z);
		
		int resulado = 4 + 5 * 6  / 3; // tiene mas prioridad muliplicacion y division
		// 4 + primer paso (5*6) segundo paso / 3 = 4 +10 = 14
		System.out.println("resulado= " + resulado);
		
		resulado = ( 4 + 5 ) * 6 / 3; // TTienes mas prioridad los parentesis
		// 9 * 6 / 3 = 54 / 3 = 18
		System.out.println("resulado con parentesis = " + resulado);
		
	}

}
