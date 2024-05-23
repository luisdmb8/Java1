package mx.com.gm.peliculas.excepciones;

// Es creada para reportar problema al acceder datos 

public class AccesoDatosEx extends Exception {
	// se dedfine constructor
	public AccesoDatosEx(String mensaje) {
		super (mensaje);
	}
}
