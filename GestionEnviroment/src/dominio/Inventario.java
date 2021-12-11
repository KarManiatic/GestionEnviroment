package dominio;

import java.util.ArrayList;

public class Inventario {
	
	private int nProductos;
	private ArrayList listaProductos ;
	
	public Inventario() {	
	}

	public int getnProductos() {
		return nProductos;
	}

	public void setnProductos(int nProductos) {
		this.nProductos = nProductos;
	}

	public ArrayList getListaProductos() {
		return listaProductos;
	}

	public void addProducto(Producto productoNuevo) {
		this.listaProductos.add(productoNuevo);
		this.nProductos++;
	}
	
}
