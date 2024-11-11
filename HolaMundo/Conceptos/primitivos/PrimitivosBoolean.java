package primitivos;

public class PrimitivosBoolean {
	public static void main(String[] args) {
		
		boolean varBoolean = false;
		System.out.println("varBoolean: " + varBoolean);
		
		if (varBoolean == true) {
			System.out.println("Esto es verdadero");			
		}
		else {
			System.out.println("Esto es falso");			
	}
	
	int edad = 15 ;
	boolean esAdulto = edad >= 18;
	//if (edad >= 18)
	if (esAdulto) {
		System.out.println("Eres mayor de edad");
	}
	else {
		System.out.println("Eres menor de edad");
	}
	}
}
	
