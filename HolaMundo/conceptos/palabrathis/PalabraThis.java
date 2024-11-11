package palabrathis;

public class PalabraThis {
	public static void main(String[] args) { // constructor
		AtributosClase persona = new AtributosClase("Juan", "Perez"); // new string se puede usar pero usara mas memoria 
		System.out.println("Nombre de la persona = " + persona);
		System.out.println("Nombre de la persona = " + persona.nombre);
		System.out.println("Nombre de la persona = " + persona.apellido);
	}
}
class AtributosClase {	
	String nombre;   // se sobre entiende que es default o package
	String apellido;
	
	AtributosClase(String nombre, String apellido){   //el objeto es AtributosClase
		//super(); llamada al constructor de la clase padre (object)
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Objeto AtributosClase usando this = " + this);
		new Imprimir().imprimir(this);
	}
}

class Imprimir {
	
	public Imprimir() {    // no es necesario este codigo , se hace para verificar y ver el paso a paso
	super(); //  no se necesario , sin embargo tener en cuenta - el constructor de la clase object (padre) para reservar memoria
	}
	public void imprimir(AtributosClase persona) {
		System.out.println("persona desde imprimir = " + persona);
		System.out.println("Impresion del objeto actual (this)= " + this);
	}
}
