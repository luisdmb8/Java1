package sentencias_IF_ELSE_SWITCH;

public class controIfyElse {
	public static void main(String[] args) {
		
		boolean condicion = true;
		if (condicion) { // es lo mismo a decir condicion == true
			System.out.println("Condicion Verdadera");
		}
		else {
			System.out.println("Condicion Falsa");
		}
			
		int numero = 3;
		
		String numeroTexto = "Numero Desconocido";
		
		if (numero==1){
			numeroTexto = "Numero uno";
		}
		// else if , sino si el numero es 2 ...., esto es para colocar varios if 
		else if (numero==2) {
			numeroTexto = "Numero dos";
		}
		else if (numero==3) {
			numeroTexto = "Numero tres";
		}
		else if (numero==4) {
			numeroTexto = "Numero cuatro";
		}
		// si se quita este else saldra Numero desconocido , ya que arriba 
		else {
			numeroTexto = "Numero no encontrado";
		}
		System.out.println("Numero de texto = " + numeroTexto);
	}

}
