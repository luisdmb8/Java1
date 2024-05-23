package clases;

public class ObjetosJava2 {
	public static void main(String[] args) {
		
		// los objetos no comparten informacion 
		
		// primer Objeto
		
		AtributosClase persona1 = new AtributosClase(); //nuevo objeto para llamar la clase AtributosClase
		persona1.nombre = "Juan"; // Ingresar a la clase y llamar el string de la clase AtributosClase
		persona1.apellido = "Perez"; // Ingresar a la clase y llamar el string de la clase AtributosClase
		persona1.desplegarInformacion(); // Llama el metodo desplegarInformacion de la clase AtributosClase
		
		
		// Segundo Objeto , Mirar la posicion de memoria ram 
		
		AtributosClase persona2 = new AtributosClase();
		System.out.println("persona 1 = " + persona1); // un espacio en memoria
		System.out.println("persona 2 = " + persona2); // un espacio de memoria
		
		persona2.desplegarInformacion(); // se imprima el valor de null , porque no se ha especificado
		persona2.nombre="Karla";
		persona2.apellido="Lara";
		persona2.desplegarInformacion();  // Se imprimi los valores del segundo objeto
	}
}
