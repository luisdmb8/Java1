package testlist;

import java.util.*;

public class TestColecciones {
	public static void main(String[] args) {
		
		//Tipo Lista 
		
		List miLista = new ArrayList();  // se define el tipo y luego el orden
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		
		// se itera con foreach 
		
		for(Object elemento:miLista) {
			System.out.println("elemento = " + elemento);
		}
		
		//Java 8
		//miLista.forEach(elemento -> {
		//	System.out.println("elemento = " + elemento);
		//});
	
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");

	}

}
