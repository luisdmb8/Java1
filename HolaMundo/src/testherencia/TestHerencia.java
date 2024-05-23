package testherencia;

import herencia.Cliente; //import herencia.Empleado;
import java.util.Date;
import herencia.Persona;
import herencia.Empleado;

public class TestHerencia {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 5000.0);
//		Empleado empleado1 = new Empleado("pedro", 'm', 12, "cr2", 1, 20.0);
		
		System.out.println("Empleado1 = " + empleado1);
//		
//		Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "tierra 20");
//		System.out.println("Cliente = " + cliente1);
//		
	}
	
}
