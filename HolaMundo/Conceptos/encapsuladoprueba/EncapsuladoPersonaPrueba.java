package encapsuladoprueba;

import encapsulamiento.EncapsulamientoPersona;

public class EncapsuladoPersonaPrueba {
	
	public static void main(String[] args) {
		
		EncapsulamientoPersona persona1 = new EncapsulamientoPersona("Juan", 50000, false);
		System.out.println("Persona nombre sin cambio: " + persona1.getNombre());
		System.out.println("persona1: " + persona1.toString()); // sin cambios
		persona1.setNombre("Juan Carlos"); // tiene el modificador privado por eso se usa set de la clase EncapsulamientoPersona
		System.out.println("Persona nombre con cambio: " + persona1.getNombre()); // se usa get ya que se hizo el set 
		System.out.println("El sueldo de Juan es: " + persona1.getSueldo());
		System.out.println("Persona Eliminado : " + persona1.isEliminado());
		
		System.out.println("persona1: " + persona1.toString()); // con cambios
		
		persona1.setNombre("Carlos");
		System.out.println("persona1: " + persona1);  // se puede llamar tambien de esta manera sin el to String
	}

}
