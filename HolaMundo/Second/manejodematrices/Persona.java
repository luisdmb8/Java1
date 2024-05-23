package manejodematrices;

public class Persona {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		 // se agrega estp + ", " + super.toString() , para ver el resultado del metodo padre
		return "Persona [nombre=" + nombre + "]" + ", " + super.toString();
	}
	

}
