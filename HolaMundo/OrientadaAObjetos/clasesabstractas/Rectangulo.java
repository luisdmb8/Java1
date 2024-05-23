package clasesabstractas;

public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	@Override
	public void dibujar() {
		System.out.println("se imprimi un: " + this.getClass().getSimpleName());
	}
	

}
