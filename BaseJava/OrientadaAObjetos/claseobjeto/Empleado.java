package claseobjeto;

import java.util.Objects;

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
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	// lo toma para revisarq que sean iguales los hash
	@Override
	public int hashCode() {
		return Objects.hash(nombre, sueldo);
	}
	// equals compara el contenido de dos objetos 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}
	
	

}
