package contextopersonaprueba;

import contextostatico.EstaticoPersona;

public class EstaticoPersonaPrueba {
		private int contador ; 
	
	public static void main(String[] args) {
		
		EstaticoPersona persona1= new EstaticoPersona("Juan");
		System.out.println("persona1 = " + persona1);
		
		EstaticoPersona persona2= new EstaticoPersona("Carla");
		System.out.println("persona1 = " + persona2);
		
		// no se puede usar la palabra this dentro de un metodo statico
		
		imprimir(persona1);
		imprimir(persona2);
	}
	//Otro metodo dentro de un metodo estatico , siempre debe ser estatico 
	public static void imprimir(EstaticoPersona persona) {
		System.out.println("persona = " + persona);
	}
	// metodo no estatico 
	public int getContador() {
		imprimir(new EstaticoPersona("Carlos"));
		return this.contador;
	}

}
