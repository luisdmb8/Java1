package accesosdatos;

public interface IAccesoDatos {
	
	int MAX_REGISTRO = 10;
	
	//metodos abstractos 
	
	void insertar();
	void listar();
	void actaulizar();
	void eliminar();
}
