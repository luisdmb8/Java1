package ejercicios;

public class Caja {
public static void main(String[] args) {
	
	// Se ejecuta el constructor vacio
	LaboratorioCaja volumen1= new LaboratorioCaja();
	System.out.println("Aritmetica1 a:" + volumen1.al);
	System.out.println("Aritmetica1 b:" + volumen1.an);
	System.out.println("Aritmetica1 b:" + volumen1.pro);
	
	// Se ejecuta con valores 
	LaboratorioCaja volumen2= new LaboratorioCaja(2, 3, 6);
	System.out.println("Aritmetica1 a:" + volumen2.al);
	System.out.println("Aritmetica1 b:" + volumen2.an);
	System.out.println("Aritmetica1 b:" + volumen2.pro);
	
	
	int volumenResultado = volumen2.volumen();
	System.out.println("El volumen de la caja sera = " + volumenResultado);
}

	
	
}
