package operadores;

public class OperadoresRelacionales {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		
		boolean c = a >= b; // si a es mayor o igual que b 
		System.out.println("c = " + c);
		
		if (a% 2 == 0) {  // si es igual a 0 sera a numero par 
			System.out.println("Es numero par");
		}
		else {
			System.out.println("Es numero impar");
		}
		
		int edad = 30;
		int adulto = 18;
		
		if (edad >= adulto) {  // si es mayor o igual a 18 imprimira que es un adulto
			System.out.println("Es un adulto");
		}
		else {
			System.out.println("no es adulto");
		}
		
		
	}
}
