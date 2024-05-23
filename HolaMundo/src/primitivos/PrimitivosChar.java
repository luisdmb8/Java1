package primitivos;

public class PrimitivosChar {
	public static void main(String[] args) {
		
		//https://en.wikipedia.org/wiki/List_of_Unicode_characters
		
		char miCaracter = 'a';
		System.out.println("miCaracter: " + miCaracter);
		
		char varChar = '\u0021'; // Unicode 
		System.out.println("varChar: " + varChar);
		
		char varCharDecimal = 33 ; // Decimal
		System.out.println("varCharDecimal: " + varCharDecimal);
		
		char varCharSimbolo = '!' ; // Simbolo
		System.out.println("varCharSimbolo: " + varCharSimbolo);
		
		int variableEnteraSimbolo = '!'; // Se conviertte al decimal
		System.out.println("Simbolo ! en decimal : " + variableEnteraSimbolo);
		
		int letra = 'a'; // Se conviere al decimnal
		System.out.println("Letra a en decimal: " + letra);
	}
}
