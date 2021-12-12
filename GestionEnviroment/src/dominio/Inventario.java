package dominio;

import java.util.ArrayList;

import persistencia.Agente;

public class Inventario {
	
	private int nProductos;
	private ArrayList listaProductos ;
	private String nombreUsuario;
	
	public Inventario(String nombreUsuario) throws Exception  {
		nProductos = 0;
		listaProductos = null;
		this.nombreUsuario = nombreUsuario;
		
		Agente a = null;
		a = Agente.getAgente();
		
		a.getAgente().crearBaseDatosSiNoExiste("CREATE TABLE `gestionenviromentdb`.`inventario"+nombreUsuario+"` (`id` INT NOT NULL,`tipo` VARCHAR(45) NULL,`nombre` VARCHAR(45) NULL,`nuevo` TINYINT NULL,`precio` DOUBLE NULL, PRIMARY KEY (`id`))");
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
