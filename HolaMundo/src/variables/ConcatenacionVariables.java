package variables;

public class ConcatenacionVariables {
	public static void main (String args[]) {
		String usuario = "Juan";
		String titulo = "Ingeniero";
		String union = titulo + " " + usuario ;
		System.out.println("union = " + union);
		
		//Se realiza la suma de numeros
		int i = 3;
		int j = 4;
		System.out.println(i + j); // se realiza la suma
		System.out.println(i + j + usuario); // Evaluacion de izq a der . realiza suma
		System.out.println(usuario + i + j); // contexto cadena , todo es una cadena
		System.out.println(usuario + (i + j)); // uso de parentesis modificacion de primarios
	}

}
