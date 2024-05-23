package contextostatico;

public class EstaticoPersona {
	// LAS VARIABLES ESTATICAS SE ASOCIAN CON LA CLASE
	private int idPersona; // se asocian a los metodos no a la clase 
	private String nombre; // se asocian a los metodos no a la clase 
	private static int contadorPersonas;  // si no es static el valor se reinicia de nuevo a 0 
	
	//constructor de la clase , donde recibe nada mas el nombre de la persona
	public EstaticoPersona(String nombre) {
		this.nombre = nombre;
		//Incrementar el contador por cada Objeto
		EstaticoPersona.contadorPersonas++;   // se asocian con la clase EstaticoPersona
		// Asignar el nuevo valor a la variable idPersona
		this.idPersona = EstaticoPersona.contadorPersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		EstaticoPersona.contadorPersonas = contadorPersonas;
	}
	
	// El Override significa que estamos sobreescribiendo el metodo toString
	@Override
	public String toString() {
		return "EstaticoPersona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
}
