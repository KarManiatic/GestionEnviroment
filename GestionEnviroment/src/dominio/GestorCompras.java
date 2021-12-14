package dominio;

public class GestorCompras {
	
	public static boolean compraSaldo(int id, String login, String password) throws Exception {
		boolean check = false;
		Catalogo catalogo = new Catalogo(10);
		Producto producto = Catalogo.readProducto(id);
		Cliente cliente = Cliente.read(login, password);
		if(cliente.pagoSaldo(producto.getPrecio())){
			catalogo.eliminarProducto(id);
			cliente.añadirProductoInventario(producto);
			check = true;
		}
		return check;
	}
	
	public static boolean compraTarjeta(int id, long numerjeta, String login, String password) throws Exception {
		Cliente cliente = Cliente.read(login, password);
		boolean check = false;
		Producto producto = Catalogo.readProducto(id);
		if(cliente.pagoTarjeta(numerjeta)){
			Catalogo.eliminarProducto(id);
			cliente.añadirProductoInventario(producto);
			check = true;
		}
		return check;
	}

}
