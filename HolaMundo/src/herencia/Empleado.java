package herencia;

public class Empleado extends Persona {
// extends se usa para heredar , en este caso Empleado (Hijo) hereda de Persona (Padre)
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado () {
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}
	
	public Empleado(String nombre, double sueldo) {
		//super(nombre);  // se utiliza para llamar el constructor de la clase padre
		this();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	//STRING BUILDER 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Empleado{idEmpleado=").append(idEmpleado);
		sb.append(", sueldo=").append(sueldo);
		sb.append(", Persona= {").append(super.toString()).append("}");
		sb.append('}');
		return sb.toString();
	}
	
}
