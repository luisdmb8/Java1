package matrices;

public class TestArreglos {
	public static void main(String[] args) {
		// con [] se indica que la variable es un arreglo
		int edades[] = new int [3]; // se debe colocar la cantidad de elementos 
		System.out.println("edades = " + edades); // direccion de memoria
		
		// acceder a cada uno de los elementos del arreglo o arrays
		
		edades[0] = 10;
		System.out.println("edades 0 =" + edades[0]);
		
		edades[1] = 5;
		System.out.println("edades 1 =" + edades[1]);
		
		
		edades[2] = 12;
		System.out.println("edades 2 =" + edades[2]);	
		
		//edades[3] = 12; da error ya que tenemos solo 3 elemento de 0-2
		
		// cantidad de elemtnos del array
		
		for (int i = 0 ; i < edades.length ; i++)
			System.out.println("edades elemento = " + i + ": " + edades[i]);
	
		
	}

}
