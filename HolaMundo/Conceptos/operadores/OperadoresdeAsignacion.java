package operadores;

public class OperadoresdeAsignacion {
	public static void main(String[] args) {
		
		int a=3, b=2;
		int c = a + 5 - b;
		System.out.println("resultado de c= " + c);
		
		a+=1; // a = a+1
		System.out.println("resultado de a= " + a);
		
		// a ahora sera 4 
		a+=3; // a = a+3
		System.out.println("resultado de a= " + a);
		
		// a ahora sera 7 
		a-=2; // a = a-2
		System.out.println("resultado de a= " + a);
		
		// Funciona de igual manera para los otros operadores
		//  *=     /=     %=
		
	}

}
