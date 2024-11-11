package testenumeracion;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeracion {
	public static void main(String[] args) {
//		System.out.println("Dia uno de la semana: " + Dias.LUNES);
//		indicarDiaSemana(Dias.MARTES);
		
		System.out.println("Continen numero 4: " + Continentes.AMERICA);
		System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
		
		System.out.println("Continen numero 1: " + Continentes.AFRICA);
		System.out.println("No. Paises en el 1r continente: " + Continentes.AFRICA.getPaises());
	}
	
	private static void indicarDiaSemana(Dias dias) {
		switch(dias) {  // se usa switch para preguntar
			case LUNES:     // se pregunta por un caso 
				System.out.println("Primer dia de la semana");
				break;
			case MARTES:
				System.out.println("Segundo dia de la semana");
				break;
			case MIERCOLES:
				System.out.println("Tercer dia de la semana");
		default:
			break;
			
		}
	}

}
