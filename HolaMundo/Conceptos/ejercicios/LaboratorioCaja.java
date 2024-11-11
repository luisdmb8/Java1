package ejercicios;

public class LaboratorioCaja {
	
	int an;    //ancho
	int al;	   //alto
	int pro;   //profundo
	
	public LaboratorioCaja () {
		System.out.println("Ejecutando Constructor");
	}
	
	public LaboratorioCaja(int arg1, int arg2, int arg3) {
		// El this se coloca para que acceda al argumento de la clase 
		this.an = arg1;    
		this.al = arg2;
		this.pro = arg3;				
		System.out.println("Ejecutando constructor con argumentos");
	}
	
	public int volumen() {
		return  an * al * pro;
	}
}
