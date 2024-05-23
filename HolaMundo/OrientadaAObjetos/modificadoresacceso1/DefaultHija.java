package modificadoresacceso1;

public class DefaultHija extends Default1 {
	public DefaultHija() {
		super();
		this.atributoDefault = "Modificacion atributo default";
		System.out.println("atributoDefault = " + this.atributoDefault);
		this.metodoDefault();
	}

	
}
