package paso;

import clases.AtributosClase;

public class PasoPorReferencia {
	public static void main(String[] args) {
		
		AtributosClase persona1 = new AtributosClase();
		persona1.nombre = "Juan" ; 
		System.out.println("Persona1 nombre : " + persona1.nombre);
		cambiaValor(persona1);
		System.out.println("Persona1 cambio de nombre : " + persona1.nombre);
	}

	public static void cambiaValor(AtributosClase persona) {
		persona.nombre = "Karla";
	}
}
