package testfinal;

public final class Persona { // si tiene el final quiere decir que no servira para heredar en clase   

	public final static int MI_CONSTANTE = 1;
	
	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public final void imprimir() { // si se coloca final no se puede cambiar su valor en este metodo 
	System.out.println("Metodo Imprimir");
  }


}
