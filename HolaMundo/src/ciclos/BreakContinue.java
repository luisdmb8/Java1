package ciclos;

public class BreakContinue {
	public static void main(String[] args) {
		for (int contador = 0 ; contador < 3 ; contador++ ) {
			if (contador % 2 == 0) { // Para numeros pares
				System.out.println("contador con break= " + contador);
				break; // rompe el cilo que se esta ejecutando 
			}
		}
		
	// se invierta la logica 
	for (int contadorimpar = 0 ; contadorimpar < 3 ; contadorimpar++ ) {
		if (contadorimpar % 2 != 0) { // para numeros impares 
			continue; // ir a la siguiente interacion , 
			// continue no va ejecutar nada del ciclo for
		}
		System.out.println("contador con continue = " + contadorimpar);
	}
	
}

}
