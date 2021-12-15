package dominio;

public class GestorCompras { //Totalmente funcional
	
	public static boolean compraSaldo(int id, String login, String password) throws Exception { 
		boolean check = false;
		Catalogo catalogo = new Catalogo();
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
		boolean check = false;
		Catalogo catalogo = new Catalogo();
		Cliente cliente = Cliente.read(login, password);
		Producto producto = Catalogo.readProducto(id);
		if(cliente.pagoTarjeta(numerjeta)){
			catalogo.eliminarProducto(id);
			cliente.añadirProductoInventario(producto);
			check = true;
		}
		return check;
	}

}
