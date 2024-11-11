package modificadoresacceso1;

public class Protected1 {
	protected String atributoProtected = "Valor atributo protected";  // se usa Public para que en Test pueda ingresar sin problema
	
	public Protected1() {
		System.out.println("Constructor Protected"); // constructor protected
	}
	
	public Protected1(String arg) {
		System.out.println("Constructor Protected"); // para que nos deje llamarlo desde test
	}
	
	public void metodoProtected() {
		System.out.println("Metodo Protected");  // Metodo protected
	}
}
