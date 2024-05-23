package matrices;

import manejodematrices.Persona;

public class TestMatrices {
	public static void main(String[] args) {
		//int edades[renglones][columnas];
		int edades[][] = new int[3][2];
		System.out.println("edades = " + edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		edades[2][0] = 6;
		edades[2][1] = 9;

		
		System.out.println("edades 0-0 = " + edades[0][0]);
		System.out.println("edades 0-1 = " + edades[0][1]);
		System.out.println("edades 1-0 = " + edades[1][0]);
		System.out.println("edades 1-1 = " + edades[1][1]);
		System.out.println("edades 2-0 = " + edades[2][0]);
		System.out.println("edades 2-1 = " + edades[2][1]);

		// Iteracion de FOR
		
		for (int renglon = 0; renglon < edades.length; renglon++) {
			//edades[renglon].length; se hace de esta manera para que cuente el for anterior 
			for (int columnas = 0; columnas < edades[renglon].length; columnas++) {
				System.out.println("edades con el ciclo for " + renglon + "-" + columnas + ": " + edades[renglon][columnas]);
			}
		}
		
		//sintaxis simplificada  , iteracion de FOR 
		
		String frutas[][] = {{"Naranja", "Limon"},{"Fresa", "Zarzamora", "	Mora"}};
		imprimir(frutas);
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		personas[0][2] = new Persona("Luis");
		personas[1][0] = new Persona("David");
		personas[1][1] = new Persona("Katherin");
		personas[1][2] = new Persona("Daniela");
		imprimir(personas);
	}
	
	public static void imprimir(Object matriz[][]) {
		
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {
				System.out.println("Frutas con el ciclo for = " + ren + "-" + col + ": " + matriz[ren][col]);
			}	
		}
	}
	
}
