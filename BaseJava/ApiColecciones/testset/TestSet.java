package testset;

import java.util.*;

public class TestSet {
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
	miLista.add("Viernes"); // se puede duplicar con SET no se puede

	imprimir(miLista);
	

	Set miSet = new HashSet(); // No respeta el orden 
	miSet.add("Lunes");
	miSet.add("Martes");
	miSet.add("Miercoles");
	miSet.add("Jueves");
	miSet.add("Viernes");
	miSet.add("Sabado");
	miSet.add("Domingo");
	
	imprimir(miSet);
	
	Map miMapa = new HashMap();
	miMapa.put("Valor1", "Juan");
	miMapa.put("Valor2", "Karla");
	miMapa.put("Valor3", "Rosario");
	
	String elemento = (String) miMapa.get("Valor1");
	System.out.println("Elemento Map = " + elemento);
	
	imprimir(miMapa.keySet()); // Valores
	imprimir(miMapa.values()); // Valores asociados a cada llave

	}
	// se usa collection de la libreria , Polimorfismo
	public static void imprimir(Collection coleccion) {
		for(Object elemento:coleccion) {
			System.out.println("elemento = " + elemento);
		}
	}

}

