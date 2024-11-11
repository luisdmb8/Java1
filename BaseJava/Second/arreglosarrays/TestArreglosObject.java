package arreglosarrays;

public class TestArreglosObject {
	public static void main(String[] args) {
		
		// usualmente los arrays van en plural
		
		Persona personas [] = new Persona[2];
		
		personas [0] = new Persona("Juan");
		personas [1] = new Persona("karla");
		
		System.out.println("personas 0 =" + personas[0]);
		System.out.println("personas 1 =" + personas[1]);
		
		for (int i=0 ; i < personas.length ; i ++ ) {
			System.out.println("personas con ciclo for = " + i + ": " + personas[i]);
			
		}
		
		//sintaxis resumida
		String frutas[] = {"naranja" ,"platano","UVA"}; // se coloca el numero de elementos con sus valores
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Frutas = " + frutas[i]);
		}
	
		}
			
	}
