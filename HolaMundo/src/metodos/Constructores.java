package metodos;

public class Constructores {
	public static void main(String[] args) {
		
		
		// Se ejecuta el constructor vacio
		CreacionMetodos aritmetica1= new CreacionMetodos();
		System.out.println("Aritmetica1 a:" + aritmetica1.a);
		System.out.println("Aritmetica1 b:" + aritmetica1.b);
		
		// Se ejecuta el contrsuctor con argumentos 
		CreacionMetodos aritmetica2= new CreacionMetodos(5, 8);
		System.out.println("Aritmetica1 a:" + aritmetica2.a);
		System.out.println("Aritmetica1 b:" + aritmetica2.b);
	}
}
