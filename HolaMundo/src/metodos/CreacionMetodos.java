package metodos;

public class CreacionMetodos {
	
	//Atributos de la clase 
	
	int a;
	int b;
	
	//Constructor vacio
	
	public CreacionMetodos() {
		System.out.println("Ejecutando Constructor");
		
	}
	
	//Sobrecarga de contructores 
	
	public CreacionMetodos(int arg1, int arg2) {
		// El this se coloca para que acceda al argumento de la clase 
		this.a = arg1;    
		this.b = arg2;
				
		System.out.println("Ejecutando constructor con argumentos");
	}
	
	//Metodo
	public void sumar() {
		int resultado = a + b;
		System.out.println("resultado = " + resultado);
	}

	public int sumarConRetorno() {
//		int resultado = a + b ; // tambien funciona
//		return resultado; // tambien funciona
		return a + b;
		
	}
	
	// Argumentos a un metodo
	public int sumarconArgumentos(int arg1 , int arg2) {
		a = arg1;
		b = arg2;
		// return a + b; // tambien funciona 
		return sumarConRetorno();
	}
	
	// Argumentos a un metodo
	public int sumarconArgumentosThis(int argu1 , int argu2) {
		this.a = argu1;
		this.b = argu2;
		// return a + b; // tambien funciona 
		return this.sumarConRetorno();
	}
	
}
