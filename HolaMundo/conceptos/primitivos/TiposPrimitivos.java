package primitivos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		/*
		 tipos primitivos enteros : byte , short , int , long
		 */
		//byte numeroByte = (byte)129; Se corre el riesgo de que se pierda info y no lo dejara imprimirlo
		byte numeroByte = 50;
		System.out.println("Valor byte: " + numeroByte); 
		System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
		
		
		short numeroShort = 32767;
		//short numeroShort = (short)32768; Se corre el riesgo de que se pierda info y no lo dejara imprimirlo
		System.out.println("Valor Short: " + numeroShort);
		System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
		System.out.println("Valor maximo Short:" + Short.MAX_VALUE);
		
		int numeroInt = 10;
		// int numeroInt = (int)2147483648L; Se corre el riesgo de que se pierda info y no lo dejara imprimirlo
		System.out.println("Valor int: " + numeroInt);
		System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
		System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
		
		long numeroLong = 9223372036854775807L;
		// long numeroInt = (long)9223372036854775807D; Se corre el riesgo de que se pierda info y no lo dejara imprimirlo
		System.out.println("Valor Long: " + numeroLong);
		System.out.println("Valor minimo Long:" + Long.MAX_VALUE);
		System.out.println("Valor maximo Long:" + Long.MIN_VALUE);
		
	}
	

}
