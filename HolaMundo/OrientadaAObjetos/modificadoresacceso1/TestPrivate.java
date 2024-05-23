package modificadoresacceso1;

public class TestPrivate {
	public static void main(String[] args) {
		 
		Private1 private1 = new Private1("Publico");
		
		private1.setAtributoPrivado("Cambio valor atributo");
		System.out.println("Private 1 = "+ private1.getAtributoPrivado());
	}

}
