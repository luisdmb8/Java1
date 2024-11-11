package testinstanceof;

import instanceofjava.*;

public class TestInstanceOf {
	public static void main(String[] args) {
		//Empleado empleado = new Empleado ("Juan", 5000);	
		//determinarTipo(empleado);
		//empleado = new Gerente("Karla", 1000.0, "Contabilidad");  // tambien funcionan para llamar el tipo gerente
		//determinarTipo(empleado);
		Gerente gerente = new Gerente("Karla", 1000.0, "Contabilidad");
		determinarTipo(gerente);
	}
	
		// se va a preguntar a que tipo es la variable que se llama empleado 
	
	public static void determinarTipo(Empleado empleado) {
		if(empleado instanceof Gerente) {
			System.out.println("Es de tipo Gerente");
			//si se llama manual
			Gerente gerente = (Gerente)empleado;
			// generado pro eclipse
			//((Gerente) empleado).getDepartamento();
			System.out.println("gerente = " + gerente.getDepartamento());
		}
		// se usa else if si solo queremos una respuesta e if nada mas si queremos una respuesta general
		else if(empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
		}
		// se usa else if si solo queremos una respuesta
		else if (empleado instanceof Object) {
			System.out.println("Es de tipo Object");
		}
	}
}
