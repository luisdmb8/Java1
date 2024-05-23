package modificadoresacceso1;

class Private1 {
	private String atributoPrivado = "Valor atributo Privado"; // Para leerlo o modificarlo se debe encapsular con get y set
	
	private Private1() {
		System.out.println("Constructor Privado"); // constructor privado
	}
	// se crea para llamarlo en otra clase
	public Private1(String argumento) {
		this();
		System.out.println("Constructor Publico");
	}
	
	private void metodoPrivado() {
		System.out.println("Metodo Privado");
	}
	
	
	// Se agregan para modficarlo 
	
	public String getAtributoPrivado() {
		return atributoPrivado;
	}
	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}
	
	
}
