package testmanejoarchivos;

import manejoarchivos.*;

public class TestManejoArchivos {
	public static void main(String[] args) {
		String nombreArchivo = "/home/luismartinez/eclipse-workspace/prueba.txt";
		// Crear archivo
		//ManejoArchivos.crearArchivo(nombreArchivo);
		
		// Sobreescribir informacion 
//		ManejoArchivos.escribirArchivo(nombreArchivo, "Hola desde Java");
//		ManejoArchivos.escribirArchivo(nombreArchivo, "Adios");
		
		// Adicionar informacion al archivo
//		ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde java");
//		ManejoArchivos.anexarArchivo(nombreArchivo, "Adios");
		
		// Leer informacion 
		ManejoArchivos.leerArchivo(nombreArchivo);

	}

}
