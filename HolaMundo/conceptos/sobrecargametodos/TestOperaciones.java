package sobrecargametodos;

public class TestOperaciones {
	public static void main(String[] args) {
		int resultado = Operaciones.sumar(5, 3);
		System.out.println("Resultado suma = " + resultado);
		
		double resultado2 = Operaciones.sumar(2.0, 3);
		System.out.println("Resultado double = " + resultado2);
		
		double resultado3 = Operaciones.sumar(3, 5L); // El tipo double soporta un Long
		System.out.println("Resultado Long = " + resultado3);
		
	}

}
