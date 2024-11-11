package testargumentos;
// se pasara argumentos a un metodo 
public class TestArgumentosVariables {
	public static void main(String[] args) {
		imprimirNumeros(3, 4, 5, 7);
		imprimirNumeros(1, 2);
		variosParametros("Juan", 0, 3, 5, 87, 4);
	}
	
	private static void variosParametros(String nombre, int... numeros) { // varios argumentos y el variable debe ser el ultimo parametro
		System.out.println("nombre = " + nombre);
		imprimirNumeros(numeros);
	}
	
	private static void imprimirNumeros(int... numeros) { //quiere decir que se recibira argumentos variables tipo int en este caso
	for (int i = 0; i < numeros.length; i++) {  
		System.out.println("elementos: " + numeros[i]);
	}
	
	}
}
