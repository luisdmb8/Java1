package testconversionobjetos;

import conversionobjetos.*;

public class TestConversionObjetos {
	public static void main(String[] args) {
		
		Empleado empleado;
		
		empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
		System.out.println("Empleado = " + empleado);
		
		System.out.println(empleado.obtenerDetalles());
				
		// Conversion de objetos 
		//DownCasting -- Se convierte de tipo poadre a hija
		//((Escritor)empleado).getTipoEscritura();
		Escritor escritor = (Escritor) empleado;
		escritor.getTipoEscritura();
		
		// Upcasting -- se convierte un tipo de clase hija a clase Padre
		Empleado empleado2 = escritor;
		// se puede ingresar a la clase padre e hija 
		System.out.println(empleado2.obtenerDetalles());
		
		
	}

}
