package mx.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {
	
	String NOMBRE_RECURSO = "/home/luismartinez/eclipse-workspace/peliculas.txt";
	//String NOMBRE_RECURSO = "peliculas.txt";
	
	void agregarPelicula(String nombrePelicula);
	void listarPeliculas();
	void buscarPelicula(String buscar);
	void iniciarArchivo();

}
