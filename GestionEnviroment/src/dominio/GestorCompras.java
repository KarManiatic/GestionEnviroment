package dominio;

public class GestorCompras {
	
	public boolean compraSaldo(int id, String login, String password) throws Exception {
		boolean check = false;
		Producto producto = Catalogo.readProducto(id);
		Cliente cliente = Cliente.read(login, password);
		if(cliente.pagoSaldo(producto.getPrecio())){
			Catalogo.eliminarProducto(id);
			cliente.a�adirProductoInventario(producto);
			check = true;
		}
		return check;
	}
	
	public boolean compraTarjeta(int id, long numerjeta, String login, String password) throws Exception {
		Cliente cliente = Cliente.read(login, password);
		boolean check = false;
		Producto producto = Catalogo.readProducto(id);
		if(cliente.pagoTarjeta(numerjeta)){
			Catalogo.eliminarProducto(id);
			cliente.a�adirProductoInventario(producto);
			check = true;
		}
		return check;
	}

}
