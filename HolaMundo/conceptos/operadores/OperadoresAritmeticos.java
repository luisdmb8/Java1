package operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int a=3, b=2;
		int resultado = a + b ;
		System.out.println("resultado suma: " + resultado);
		
		resultado = a - b;
		System.out.println("resultado resta: " + resultado);
		
		resultado = a * b;
		System.out.println("resultado multiplicacion: " + resultado);
		
		double resultado2 = 3D / b ;
		System.out.println("resultado division flotante : " + resultado2);
		
		float resultado3 = 3f / b ;
		System.out.println("resultado division double: " + resultado3);
		
		resultado = a % b ;
		System.out.println("resultado modulo: " + resultado);
		
		if (b % 2 == 0 ) // si es divisible entre 2 , el reisidio es 0 por ende es par , si es diferente es impar 
			System.out.println("Es numero par");
		else
			System.out.println("Es numero impar");
	}

}
