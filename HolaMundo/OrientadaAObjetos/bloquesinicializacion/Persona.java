package bloquesinicializacion;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	static { // bloque de codigo de inicializacion estatico siempre antes del constructor
		System.out.println("Ejecucion bloque estatico");
		++Persona.contadorPersonas;
		// idPersona = 10; no se usa porque no es estatica
	}
	
	{
		System.out.println("Ejecucion Bloque NO estatico");
		this.idPersona = Persona.contadorPersonas++; // bloque de codigo de inicializacion no estatico siempre antes del constructor
	}
	
	public Persona() {
		System.out.println("Ejecucion del constructor");
	}

	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}
	
}
