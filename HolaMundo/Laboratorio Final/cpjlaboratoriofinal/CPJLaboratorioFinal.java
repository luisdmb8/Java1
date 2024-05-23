package cpjlaboratoriofinal;

import mx.com.gm.peliculas.negocio.*;
import java.util.Scanner;

public class CPJLaboratorioFinal {
	public static void main(String[] args) {
		int opcion = -1;
		Scanner scanner = new Scanner(System.in);
		CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
		while (opcion != 0) {
			System.out.println("Elije una opcion: \n"
					+ "1. Iniciar Catalogo peliculas \n"
					+ "2. Agregar Pelicula \n"
					+ "3. Listar Pelicula \n" 
					+ "4. Buscar Pelicula \n" 
					+ "0. Salir");
			opcion = Integer.parseInt(scanner.nextLine());
			
			// Para procesar cada opcion que da el usuario
			
			switch (opcion) {
			case 1:
				catalogo.iniciarArchivo();
				break;
			case 2 :
				System.out.println("Introduce el nombre de la pelicula");
				String nombrePelicula = scanner.nextLine();
				catalogo.agregarPelicula(nombrePelicula);
				break;
			case 3 :
				catalogo.listarPeliculas();;
				break;
			case 4 :
				System.out.println("Introduce una pelicula a buscar");
				String buscar = scanner.nextLine();
				catalogo.buscarPelicula(buscar);
				break;
			case 0 :
				System.out.println("Hasta Pronto!!");
				break;
			default:
				System.out.println("Opcion no reconocida");
				break;
			}
			
		}
	}
}
