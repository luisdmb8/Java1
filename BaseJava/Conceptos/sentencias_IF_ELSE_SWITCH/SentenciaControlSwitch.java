package sentencias_IF_ELSE_SWITCH;

public class SentenciaControlSwitch {
	public static void main(String[] args) {
		int numero = 5;
		String numeroTexto = "Valor desconocido";
		
		switch (numero) {
			case 1:
				numeroTexto = "Numero uno";
				break; // si tenemos break y coincide el caso , finalizara!! 
			case 2:
				numeroTexto="Numero dos";
				break;
			case 3:
				numeroTexto = "Numero tres";
				break;
			case 4:
				numeroTexto= "Numero cuatro";
				break;
			default:
				numeroTexto = "Caso no encontrado";
		}
		System.out.println("numeroTexto = " + numeroTexto);
	}

}
