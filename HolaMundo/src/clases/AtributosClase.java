package clases;

public class AtributosClase {
	//Atributos de las clases
	public String nombre;      // se coloca el public para el ejemplo de Paso por reference , NO ES BUENA PRACTICA COLOCAR EL PUBLIC!!!
	public String apellido;
	
	//metodo de las clases
	public void desplegarInformacion() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);

	}

}
