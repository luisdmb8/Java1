package clases;

public class ObjetosJava {
	public static void main(String[] args) {
		
		AtributosClase persona1;
		persona1 = new AtributosClase(); //nuevo objeto para llamar la clase AtributosClase
		persona1.nombre = "Juan"; // Ingresar a la clase y llamar el string de la clase AtributosClase
		persona1.apellido = "Perez"; // Ingresar a la clase y llamar el string de la clase AtributosClase
		persona1.desplegarInformacion(); // Llama el metodo desplegarInformacion de la clase AtributosClase
	}

}
