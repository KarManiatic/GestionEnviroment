package dominio;

public class Producto {
	
	private String id;
	private String nombre;
	private String tipo;
	private double precio;
	private boolean nuevo;
	
	
	public Producto(String id, String nombre, String tipo, double precio, boolean nuevo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.nuevo = nuevo;
	}
	
	
	
}
