package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;


public interface AccesoDatos {
	// se coloca la excepcion (throws AccesoDatosEx;) debido a que si llega a existir algun problema que arroje la excepcion
	boolean existe(String nombreRecurso) throws AccesoDatosEx; 
	// se cambia de nombreArchivo a nombreRecurso para dejarlo mas generico
	List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx ; // se llama el throws LecturaDatosEx para que arroje la excepcion
	void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx ;
	String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
	void crear(String nombreRecurso) throws AccesoDatosEx;
	void borrar(String nombreRecurso) throws AccesoDatosEx;

}
