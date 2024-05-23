package modificadoresaccesoprotected;

import modificadoresacceso1.Protected1;

public class ClaseHija extends Protected1 {
	
	public ClaseHija() {
		super();
		this.atributoProtected = "Modificaciones atributo protected";
		System.out.println("atributo protegido = " + this.atributoProtected);
		this.metodoProtected();
	}

}
