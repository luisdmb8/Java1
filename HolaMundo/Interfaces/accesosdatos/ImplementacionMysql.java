package accesosdatos;

public class ImplementacionMysql implements IAccesoDatos {
	
	@Override
	public void insertar() {
		System.out.println("Insertar desde MYSQL");
	}

	@Override
	public void listar() {
		System.out.println("lISTAR DESDE MYSQL");
	}

	@Override
	public void actaulizar() {
		System.out.println("ACTYUALIZAR DESDE MYSQL");
	}

	@Override
	public void eliminar() {
		System.out.println("ELIMINAR DESDE MYSQL");
	}
}
