package aritmetica;
import excepciones.*;
public class Aritmetica {
	//throws arroja la excepcion
	public static int division(int numerador, int denominador) 
			throws OperacionExcepcion{

		if( denominador == 0) {
			throw new OperacionExcepcion("Division entre cero");
		}
		return numerador / denominador ;
	}
}
