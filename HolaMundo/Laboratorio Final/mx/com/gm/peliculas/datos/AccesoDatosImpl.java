package mx.com.gm.peliculas.datos;

import java.util.*;
import java.io.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements AccesoDatos{

	// Este programa se puede generar sobre el eclipse luego de colocar el (implements AccesoDatos)
	// Luego se modifica segun se necesite
	
	@Override
	public boolean existe(String nombreRecurso) {
		//Manual
		File archivo = new File (nombreRecurso); // creando solo la variable tipo File
		return archivo.exists(); // se hace de esta manera ya que es un boolean
	}

	@Override
	public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
		//Manual
		File archivo = new File (nombreRecurso); // creando solo la variable tipo File 
		List<Pelicula> peliculas = new ArrayList<>(); // se crea la variable que recibira los datos de tipo peliculas
		try {
			// leer el archivo y que lea lineas completas
			BufferedReader entrada = new BufferedReader(new FileReader(archivo)); 
			String linea = null; 
			// La variable la cual leera cada linea
			try {
				linea =entrada.readLine();
				while(linea != null) {
					Pelicula pelicula = new Pelicula(linea);
					// se agrega a la lista cada objeto de tipo pelicula 
					peliculas.add(pelicula);
					linea = entrada.readLine(); // se vuelve a leer la linea para saber si tiene una nueva linea
				}
				entrada.close();
			} catch (IOException e) {
				e.printStackTrace();
				// se propaga la excepcion para tomas el mensaje
				throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// se propaga la excepcion para tomas el mensaje
			throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
		}
		return peliculas;
	}

	@Override
	public void escribir (Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
		File archivo = new File(nombreRecurso);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito informacion al archivo: " + pelicula);
		} catch (IOException e) {
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + e.getMessage());
		}
		
		
	}

	@Override
	public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
		File archivo = new File(nombreRecurso);
		String resultado = null;
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = null; // almacenara cada linea 
			linea = entrada.readLine(); // se lee la linea
			int indice = 1; // la primer linea tendra el valor de 1
			while (linea != null) {
				if(buscar != null && buscar.equalsIgnoreCase(linea)) { // ignose case para ignose MAY y min . 
					resultado = "Pelicula " + linea + " encontrada en el indice: " + indice;
			break;
				}
				linea = entrada.readLine(); // Leer la siguiente linea 
				indice ++; // Para que vaya aumentando el indice 
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// se propaga la excepcion para tomas el mensaje
			throw new LecturaDatosEx("Excepcion al buscar peliculas: " + e.getMessage());
			} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al buscar peliculas: " + e.getMessage());
		}	
		return resultado ;
	}

	@Override
	public void crear(String nombreRecurso) throws AccesoDatosEx {
		File archivo = new File (nombreRecurso);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo: ");
		} catch (IOException e) {
			e.printStackTrace();
			throw new AccesoDatosEx("Excepcion al crear archivo: " + e.getMessage());
		}
		
	}

	@Override
	public void borrar(String nombreRecurso) {
		File archivo = new File (nombreRecurso);
		if(archivo.exists())
			archivo.delete();
		System.out.println("Se ha borrado el archivo");
		
	}

}
