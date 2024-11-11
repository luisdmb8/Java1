package operadores;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
	int a = 3;
	int b = -a;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	
	boolean c = true;
	boolean d = !c; // Invirtiendo el valor de c , solo aplica para boolean
	
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	
	// incremento
	//1.preincremento (simbolo antes de la variable)
	int e = 3;
	int f = ++e; // primero se incrementa la variable y despues se usa su valor
	System.out.println("e = " + e);
	System.out.println("f = " + f);
	
	//2. Posincremento (simbolo despues de la variable
	int g = 5;
	int h = g++; // primero se utiliza la variable y despues se incrementa
	System.out.println("g = " + g); // teniamos pendiente un incremento
	System.out.println("h = " + h);
	
	//decremento
	//1. predecremento
	int i = 2;
	int j = --i; 
	System.out.println("i = " + i); // ya esta decrementada
	System.out.println("j = " + j);
	
	//2. postdecremento
	int k = 4;
	int l = k--; // primero se usa el valor de la variable y queda pendiente un decremento 
	System.out.println("k = " + k); // tiene pendiente un decrementada
	System.out.println("l = " + l);
	
		
	}
}
