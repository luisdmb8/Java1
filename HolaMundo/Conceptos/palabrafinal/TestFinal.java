package palabrafinal;

import testfinal.Persona;

public class TestFinal {
	public static void main(String[] args) {
		final int mivariable = 10; // se usa final para que no se puedar usar despues
		System.out.println("miVariable = " + mivariable);
		// miVariable = 5 ; no lo dejara usar 
		
		//Persona.MI_CONSTANTE =5 // no lo dejara cambiar porque tiene la plabra final
		System.out.println("Mi contante: " + Persona.MI_CONSTANTE);
		
		//metodo 
		final Persona persona1 = new Persona();
		//person1 = new Persona(); // no se puede debido a que la variable se marco como final
		persona1.setNombre("Juan"); // se puede modificar el contenido 
		System.out.println("Persona nombre : " + persona1.getNombre());
		persona1.setNombre("Carlos"); // se puede modificar el contenido 
		System.out.println("Persona nombre cambiado: " + persona1.getNombre());
	}

}
