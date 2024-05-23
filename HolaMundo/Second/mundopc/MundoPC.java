package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
	
	public static void main(String[] args) {
		Monitor monitor1 = new Monitor("DELL", 13);
		Teclado teclado1 = new Teclado("USB", "Redragon");
		Raton raton1 = new Raton ("USB", "Redragon");
		Computador computador1 = new Computador("Computador Dell", raton1, teclado1, monitor1);
		
		Monitor monitor2 = new Monitor("Gamer ASUS", 34);
		Teclado teclado2 = new Teclado("USB", "Redragon super");
		Raton raton2 = new Raton ("USB", "Redragon");
		Computador computador2 = new Computador("Computador Gamer", raton1, teclado2, monitor2);
		
		Orden orden1 = new Orden();  // se llama la clase Orden 
		orden1.agregarComputadora(computador1);  // se agregar al orden lo que colocamos en el Main
		orden1.agregarComputadora(computador2);
		
		orden1.mostrarOrden();

	}

	
}
