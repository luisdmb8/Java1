package polimorfismo;

import sobrescritura.*;


public class TestPolimorfismo {
	public static void main(String[] args) {
		// Clase Padre
		Empleado empleado = new Empleado ("Juan", 5000);
//		System.out.println("empleado : " + empleado.obtenerDetalles());
		imprimir(empleado);
		
		// Clase Hija
		Gerente gerente = new Gerente("Karla", 1000.0, "Contabilidad");
//		System.out.println("Gerente = " + gerente.obtenerDetalles());
		imprimir(gerente);
	}
	
	//Polimorfismo
	// imprimira ambas ya que tiene clase padre e hija
	public static void imprimir(Empleado empleado) {
		System.out.println("empleado = " + empleado.obtenerDetalles());
	}

}
