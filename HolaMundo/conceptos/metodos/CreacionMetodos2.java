package metodos;

public class CreacionMetodos2 {
	
	public static void main(String[] args) {
		
		CreacionMetodos aritmetica1= new CreacionMetodos(); // se crea el objeto
		aritmetica1.a = 3;
		aritmetica1.b = 2;
		aritmetica1.sumar(); // se llama el metodo
		
		int resultado = aritmetica1.sumarConRetorno(); // se llama el otro metodo con el resultado
		System.out.println("resultado desde la clase de prueba = " + resultado);
		
		
		//Argumentos de metodos
		
		resultado = aritmetica1.sumarconArgumentos(5, 8);
		System.out.println("resultado usando argumentos = " + resultado);
		
		//Argumentos de metodos con This
		
		resultado = aritmetica1.sumarconArgumentosThis(5, 10);
		System.out.println("resultado usando argumentos = " + resultado);
	}

}
