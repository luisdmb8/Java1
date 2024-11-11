package encapsulamiento;

public class EncapsulamientoPersona {
	// se usa private para que otras clases no puedan modificarlo 
	private String nombre;
	private double sueldo;
	private boolean eliminado;
	
	// se crea el constructor con el nombre de la clase
	
	public EncapsulamientoPersona(String nombre, double sueldo, boolean eliminado ) {
		// se usa this para acceder a los tributos de la clase
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}
	//por colocar get nombre va con N mayuscula 
	public String getNombre() {  // get es para obtener
		return this.nombre;
	}
	public void setNombre(String nombre) {   // set es para modificar
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo= sueldo;
	}
	// se usa is en lugar de get en los boolean
	public boolean isEliminado(){
		return this.eliminado;
	}
	
	public void setEliminado (boolean eliminado){
		this.eliminado = eliminado;
	}
	//Metodo tostring , convierte en una cadena cada uno de los metodos de la clase
	
	public String toString() {
		return "Persona [nombre: " + this.nombre +
				", sueldo: " + this.sueldo +
				", eliminado: "+ this.eliminado + "]";
	}
	
}
