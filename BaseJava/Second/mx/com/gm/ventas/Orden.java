package mx.com.gm.ventas;

public class Orden {
	
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		}
		else {
			System.out.println("Se ha superado el maximo de producto" + Orden.MAX_PRODUCTOS);
		}
		
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			Producto producto = this.productos[i];
			total += producto.getPrecio();// total=total+producto.getPrecio()
			// total +=this.productos[i].getPrecio(); con esta se reemplaza las dos lineas de arriba
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("ID Orden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de la orden: $" + totalOrden);
		System.out.println("Productos de la Orden: ");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
			
		}
	}

}
