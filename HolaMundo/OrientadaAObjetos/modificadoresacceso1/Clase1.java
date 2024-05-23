package modificadoresacceso1;

public class Clase1 {
	public String atributoPublico = "Valor atributo Publico";  // se usa Public para que en Test pueda ingresar sin problema 

	public Clase1() {
		System.out.println("Constructor  Publico"); // constructor publico
	}
	
	public void metodoPublico() {
		System.out.println("Metodo Publico");
	}
}
