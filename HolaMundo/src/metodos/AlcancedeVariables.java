package metodos;

public class AlcancedeVariables {
	
	public static void main(String[] args) {
		
		// variables Locales , se almacena en la memoria Steak 
		
		int a = 10 ;
		int b = 2 ; 
		miMetodo();   // se llama el metodo de abajo con F5 se puede evidenciar el metodo que esta llamando
		
		// Se ejecuta el constructor vacio
		CreacionMetodos aritmetica1= new CreacionMetodos();  // los objetos , Se almacena en al memoria Heap
		System.out.println("Aritmetica1 a:" + aritmetica1.a);
		System.out.println("Aritmetica1 b:" + aritmetica1.b);
		
		// Se ejecuta el contrsuctor con argumentos 
		CreacionMetodos aritmetica2= new CreacionMetodos(5, 8);
		System.out.println("Aritmetica1 a:" + aritmetica2.a);
		System.out.println("Aritmetica1 b:" + aritmetica2.b);
		
	}
	// si tiene el static sera llamado desde el metodo main
	public static void miMetodo () {
		//la variable esta fuera de alcance donde esta definida ya que esta en otro metodo  
		//a = 10;
		System.out.println("Otro metodo");
	}
}
