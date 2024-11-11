package mx.com.gm.ventas;

public class Producto {
	
	private final int idProducto; // no se debe poder modificar despues de que sea establecido el valor
	private String nombre;
	private double precio;
	// contadorProductos no se muestra en get y set ya que este se ralacione con la clase debido a que es static y no con el objeto
	private static int contadorProductos; 
	
	// SE CREA UN CONTRUCTOR VACIO PRIVADO 
	private Producto() {
		this.idProducto = ++Producto.contadorProductos; // por cada objeto que se crea se tran un nuevo identificador
	}

	public Producto(String nombre, double precio) {
		this(); // es la llamada al contructor vacio
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
