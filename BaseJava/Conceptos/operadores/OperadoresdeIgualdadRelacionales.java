package operadores;

public class OperadoresdeIgualdadRelacionales {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		
		boolean c = (a == b);
		System.out.println("c = " + c); // da false
		
		boolean d = a != b; // true si a es diferente que b 
		System.out.println("d = " + d);
		
		String cadena = "Hola";
		String cadena2 = "Adios";
		boolean e = cadena == cadena2; // compara referencia de objetos
		System.out.println("compara referencia de objetos = " + e);
		
		boolean f = cadena.equals(cadena2); // se compara el contenido uno con otro 
		
		System.out.println("Se compara el contenido = " + f);
		
		
	}
}
