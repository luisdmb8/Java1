package com.gm.mundopc;

public class Orden {
	
	public int idOrden;
	public Computador computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static int maxComputadoras = 10;
	
	 public Orden() {
		 this.idOrden = ++Orden.contadorOrdenes;
		 computadoras= new Computador[Orden.maxComputadoras];
		}
	 
	 public void agregarComputadora(Computador computadora) {  // nueva variable computadora
		 if(this.contadorComputadoras < Orden.maxComputadoras) {    // El contador de computadoras no supere el maximo 
			 this.computadoras[this.contadorComputadoras++] = computadora; // si no se ha pasado se agrega otra compuatdora 
		 }
		 else {
			 System.out.println("Has superado el limite = " + Orden.maxComputadoras);
			 
		 }
	 }
	 public void mostrarOrden() {
		 System.out.println("Orden: # " + this.idOrden);
		 System.out.println("Computadoras de la orden: #" + this.idOrden);
		 for (int i = 0; i < this.contadorComputadoras; i++) {    // cuenta los objetos que se iterado
			System.out.println(this.computadoras[i]);
		}
	 }
	 
}
