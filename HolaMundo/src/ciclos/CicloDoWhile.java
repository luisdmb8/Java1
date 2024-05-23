package ciclos;

public class CicloDoWhile {
	public static void main(String[] args) {
		
		int contador = 0;
		do {
			
			System.out.println("contador = " + contador);
			contador++;
			
		}while (contador < 3);
		//while (contador < 0); // Debido al do , se imprimira una vez contador = 0
		
	}

}
