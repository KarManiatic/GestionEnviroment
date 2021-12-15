package dominio;

import java.sql.SQLException;

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
	public static Producto readProducto(int id) throws Exception {
		String ubi = "catalogoproductos";
		
		Producto p = Producto.read(id, ubi); 
		
		return p;
	}

	public int eliminarProducto(int id) throws SQLException, Exception {
		int check;
		check = Agente.getAgente().delete("DELETE FROM `gestionenviromentdb`.`catalogoproductos` WHERE `id` = '"+id+"';");
		nProductos = nProductos-1;
		return check;
	}
	
}
