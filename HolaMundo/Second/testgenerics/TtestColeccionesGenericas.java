package testgenerics;

import java.util.*;

public class TtestColeccionesGenericas {
	public static void main(String[] args) {
		List <String> miLista = new ArrayList<>();  // se define el tipo y luego el orden
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		// Llama la variable de la posicion 0 
//		String elemento = miLista.get(0);
//		System.out.println("elemento= " + elemento);
		//imprimir todo 
		//imprimir(miLista);
		
		Set<String> miSet = new HashSet<>(); // No respeta el orden 
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");
		
		//imprimir(miSet);
		
		Map<String, String> miMapa = new HashMap<>();
		miMapa.put("Valor1", "Juan");
		miMapa.put("Valor2", "Karla");
		miMapa.put("Valor3", "Rosario");
		
		String elementoMapa = miMapa.get("Valor1");
		//System.out.println("Elemento Map = " + elementoMapa);
		imprimir(miMapa.keySet());
		imprimir (miMapa.values());
		
	}
	
	public static void imprimir(Collection<String> coleccion) {
		for(Object elemento:coleccion) {
			System.out.println("elemento = " + elemento);
		}
	}


}
