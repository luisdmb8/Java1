package sobrescritura;

public class Empleado {
	
	protected String nombre;
	protected double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		// se inicia cada uno de los tributos
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	// desde la clase Hija se modificara
	public String obtenerDetalles() {
		return "Nombre " + this.nombre + ",sueldo: " + this.sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
