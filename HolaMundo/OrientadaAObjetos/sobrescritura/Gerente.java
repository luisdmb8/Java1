package sobrescritura;

public class Gerente extends Empleado {

	private String departamento;
	
	// se inicia el constructor de la clase padre con una nueva variable 
	
	public Gerente(String nombre, double sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
		
	}
	// sobreescritura en la clase Padre
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", departamento : " + this.departamento;
	}
}
