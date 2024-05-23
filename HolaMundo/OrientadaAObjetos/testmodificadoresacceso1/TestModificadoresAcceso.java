package testmodificadoresacceso1;

import modificadoresacceso1.Clase1;
//import modificadoresacceso1.Protected1;
import modificadoresaccesoprotected.ClaseHija;

public class TestModificadoresAcceso {
	public static void main(String[] args) {
		Clase1 clase =  new Clase1();
		System.out.println("Clase 1 = " + clase.atributoPublico); // se puede acceder sin problema porque esta en public
		clase.metodoPublico();   // se imprimir el metodo
		
		System.out.println(" ");
		
		//Protected1 clase2 =  new Protected1("Publico");
		// todo lo que es protegido no deja ingresar y se debe crear la clase Hija 
		ClaseHija claseHija = new ClaseHija();
		System.out.println("Clase protected = " + claseHija);

	}

}
