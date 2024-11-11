package autoboxinunboxing;

public class TestAutoboxinUnboxing {
	public static void main(String[] args) {
		// clases envolventes de tipos primitivos 
		/*
		 int -integer
		 long - Long
		 float - Float
		 double - Double
		 boolean - Boolean
		 byte - Byte
		 char - Character
		 short - Short
		 */
		
		Integer entero = 10 ; // Autoboxing
		System.out.println("Entero = " + entero);
		// esto ya es un tipo string ya que se declaro como Integer
		System.out.println("Entero = " + entero.toString());
		// esto ya es un tipo double ya que se declaro como Integer
		System.out.println("Entero Double= " + entero.doubleValue());

		int entero2 = entero;   // Unboxing , se les extrae la literal
		System.out.println("Entero 2: " + entero2);
		
	}
	

}
