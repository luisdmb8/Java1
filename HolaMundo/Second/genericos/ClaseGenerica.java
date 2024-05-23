package genericos;

public class ClaseGenerica <T> { // variable de tipo generico 
	
	private T objeto;
	
	public ClaseGenerica(T objecto) {
		this.objeto = objecto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
	}
	
}
