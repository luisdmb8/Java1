package mx.com.gm.peliculas.negocio;

import java.util.List;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
	
	// se llama AccesoDatos
	
	private final AccesoDatos datos;

	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
	}

	@Override
	public void agregarPelicula(String nombrePelicula) {
		// convertir el String a una variable de tipo Pelicula 
		Pelicula pelicula = new Pelicula(nombrePelicula); 
		boolean anexar = false; // Para saber si vamos a anexar inf osobreescribirlo 
		try {
			anexar = datos.existe(NOMBRE_RECURSO); // se pregunta si existe el archivo
			datos.escribir(pelicula, NOMBRE_RECURSO, anexar); // si existe , se manda a escribe 
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}
	}

	@Override
	public void listarPeliculas() {
		try {
		 List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
		 // se Itera la informacion que se recibira 
		 for(Object pelicula: peliculas) {
			 System.out.println("Pelicula: " + pelicula);
		 }
		}catch(LecturaDatosEx e) {
			System.out.println("Error de acceso datos");
			e.printStackTrace(System.out);
		}
		 
	}

	@Override
	public void buscarPelicula(String buscar) {
		// si no se encuentra la pelicula tendra el valor de null 
		String resultado = null ;
		try {
			resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso datos en el metodo buscar pelicula");
			e.printStackTrace(System.out); // se imprimi la lista de errores
		}
		System.out.println("Resultado: " + resultado);
	}

	@Override
	public void iniciarArchivo() {
		try {
			if(this.datos.existe(NOMBRE_RECURSO)) {
				datos.borrar(NOMBRE_RECURSO);
				datos.crear(NOMBRE_RECURSO);
			}
			else {
				datos.crear(NOMBRE_RECURSO);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error al inciar catalogo de Peliculas");
			e.printStackTrace(System.out);
		}
	}
}
