package usoreturnnull;

import clases.AtributosClase;

public class UsoReturnNull {
	public static void main(String[] args) {
		
		AtributosClase persona1 = new AtributosClase(); // comentar para probar el null
		//AtributosClase persona1 = null ;  Esto es para probar el null
		persona1.nombre = "Juan" ; // comentar para probar el null
		System.out.println("Persona1 nombre : " + persona1.nombre); // comentar para probar el null
		persona1 = cambiaValor(persona1);
		System.out.println("Persona1 cambio de nombre : " + persona1.nombre); // comentar para probar el null
	}

	public static AtributosClase cambiaValor(AtributosClase persona) {
		if (persona == null) {
			System.out.println("Valor de persona invalido : null");
			return null;		
		}
		persona.nombre = "Karla";
		return persona;
	}
}
