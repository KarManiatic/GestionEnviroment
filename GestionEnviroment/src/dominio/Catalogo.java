package dominio;

import java.sql.SQLException;
import java.util.Vector;

import persistencia.Agente;

public class Catalogo {
	
	private int nProductos;
	
	public Catalogo(int nProductos) throws Exception  {
		nProductos = 0;
	}

	public  int getnProductos() {
		return nProductos;
	}

	public void setnProductos(int n) {
		nProductos = n;
	}

	public void addProducto(Producto productoNuevo) throws Exception{
		nProductos++;
		Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`catalogoproductos`(`id`,`tipo`,`nombre`,`precio`,`nuevo`) VALUES ("+productoNuevo.getId()+"','"+productoNuevo.getTipo()+"','"+productoNuevo.getNombre()+"','"+productoNuevo.getPrecio()+"','"+productoNuevo.isNuevo()+"');");
	}
	
	//Este método sirve para extraer los productos del inventario, 1 a uno, sabiendo la id.
	@SuppressWarnings("unchecked")
	public static Producto readProducto(int id) throws Exception {
		
		Vector<Object> aux = null;
		Vector<Object> vectoradevolver = Agente.getAgente().select("SELECT * FROM `catalogoproductos` WHERE `id` = '"+id+"';");  
		Producto p = null;
		
		aux = new Vector<Object>();
		if (vectoradevolver.size() == 1){
			aux = (Vector<Object>) vectoradevolver.elementAt(0);
			p = new Producto((int) aux.elementAt(0), (String) aux.elementAt(1), (String) aux.elementAt(2), (double) aux.elementAt(3), (int) aux.elementAt(4));
		}
		
		return p;
	}

	public int eliminarProducto(int id) throws SQLException, Exception {
		int check;
		check = Agente.getAgente().delete("DELETE FROM `gestionenviromentdb`.`catalogoproductos` WHERE `id` = '"+id+"';");
		nProductos = nProductos-1;
		return check;
	}
	
}
