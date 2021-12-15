package dominio;

import persistencia.Agente;

public class Inventario {
	
	private int nProductos;
	private String dniUsuario; 
	
	public Inventario(String dniUsuario) throws Exception  {
		nProductos = 0;
		this.dniUsuario = dniUsuario;
						
		Agente.getAgente().crearTablaDatos("CREATE TABLE IF NOT EXISTS `gestionenviromentdb`.`inventario"+dniUsuario+"` (`id` INT NOT NULL,`nombre` VARCHAR(45) NULL,`tipo` VARCHAR(45) NULL,`precio` DOUBLE NULL,`nuevo` TINYINT NULL, PRIMARY KEY (`id`))");
	}

	public int getnProductos() {
		return nProductos;
	}

	public void setnProductos(int nProductos) {
		this.nProductos = nProductos;
	}

	public void insertProducto(Producto productoNuevo) throws Exception{
		//this.listaProductos.add(productoNuevo);
		this.nProductos++;
		Agente.getAgente().insert("INSERT INTO `gestionenviromentdb`.`inventario"+dniUsuario+"`(`id`,`tipo`,`nombre`,`precio`,`nuevo`) VALUES ('"+productoNuevo.getId()+"','"+productoNuevo.getTipo()+"','"+productoNuevo.getNombre()+"','"+productoNuevo.getPrecio()+"','"+productoNuevo.isNuevo()+"');");
	}
	
	public Producto readProducto(int id, String ubi) throws Exception {
		ubi = "inventario"+dniUsuario;
		
		Producto p = Producto.read(id, ubi);
		
		return p;
	}
	
	public static void drop(String dni) throws Exception {
		Agente.getAgente().eliminarTablaDatos("DROP TABLE `gestionenviromentdb`.`inventario"+dni+"`;");
	}
	
}
