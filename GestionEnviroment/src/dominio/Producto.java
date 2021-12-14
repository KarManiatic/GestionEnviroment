package dominio;

public class Producto {
	
	private int id;
	private String nombre;
	private String tipo;
	private double precio;
	private int nuevo;
	
	
	public Producto(int id, String nombre, String tipo, double precio, int nuevo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.nuevo = nuevo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int isNuevo() {
		return nuevo;
	}


	public void setNuevo(int nuevo) {
		this.nuevo = nuevo;
	}

	public String toString() {
		String[]siNo= {"Si","No"};
		if(nuevo==1) return "ID: " + id + " || Nombre: " + nombre + " || Tipo: " + tipo + " || Precio: " + precio + " || Nuevo: "+siNo[0];
		else return "ID: " + id + " || Nombre: " + nombre + " || Tipo: " + tipo + " || Precio: " + precio + " || Nuevo: "+siNo[1];
		
	}
	
	
	
}
