package modificadoresacceso1;

public class TestDeafult {
 public static void main(String[] args) {
	 Default1 default1 = new  Default1();
	 default1.atributoDefault = "Cambio desde la prueba";
	 System.out.println("Deafult1 atributo default = " + default1.atributoDefault);
	 default1.metodoDefault();
 }
}
