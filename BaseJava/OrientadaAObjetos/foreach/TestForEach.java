package foreach;

public class TestForEach {
	public static void main(String[] args) {
		int edades[] = {5, 6, 8, 9};
		for(int edad: edades) {  // iterar un arrays de tipo enteros
		System.out.println("edades:" + edad);
		}
		
		Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
		for (Persona persona: personas) {
			System.out.println("Persona = " + persona);
		}
	}
}