package dominio;

import java.util.ArrayList;
import java.util.Vector;

import persistencia.Agente;

public class Inventario {
	
	private int nProductos;
	private ArrayList listaProductos ;
	private String dniUsuario; 
	
	public Inventario(String dniUsuario) throws Exception  {
		nProductos = 0;
		listaProductos = null;
		this.dniUsuario = dniUsuario;
						
		Agente.getAgente().crearTablaDatos("CREATE TABLE IF NOT EXISTS `gestionenviromentdb`.`inventario"+dniUsuario+"` (`id` INT NOT NULL,`tipo` VARCHAR(45) NULL,`nombre` VARCHAR(45) NULL,`nuevo` TINYINT NULL,`precio` DOUBLE NULL, PRIMARY KEY (`id`))");
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

	public void addProducto(Producto productoNuevo) throws Exception{
		//this.listaProductos.add(productoNuevo);
		this.nProductos++;
		Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`inventario"+dniUsuario+"`(`id`,`tipo`,`nombre`,`precio`,`nuevo`) VALUES ('"+productoNuevo.getId()+"','"+productoNuevo.getTipo()+"','"+productoNuevo.getNombre()+"','"+productoNuevo.getPrecio()+"','"+productoNuevo.isNuevo()+"');");
	}
	
	//Este método sirve para extraer los productos del inventario, 1 a uno, sabiendo la id.
	public Producto readProducto(int id) throws Exception {
		
		Vector<Object> aux = null;
		Vector<Object> vectoradevolver = Agente.getAgente().select("SELECT * FROM `inventario"+dniUsuario+"` WHERE `id` = '"+id+"';");  
		Producto p = null;
		
		aux = new Vector<Object>();
		if (vectoradevolver.size() == 1){
			aux = (Vector<Object>) vectoradevolver.elementAt(0);
			p = new Producto((int) aux.elementAt(0), (String) aux.elementAt(1), (String) aux.elementAt(2), (double) aux.elementAt(3), (int) aux.elementAt(4));
		}
		
		return p;
	}
	
}
