package dominio;

public class GestorProductos {

	public static String[] mostrarInventario(String login, String password) throws Exception {
		Cliente cliente = Cliente.read(login, password);
		String productos[] = new String[cliente.nProductosInventario()];
		
		for(int i=0; i < cliente.nProductosInventario(); i++) {
			productos[i] = cliente.leerProductoInventarioPersonal(i).toString();
		}
		return productos; 
	}
	
	public static String[] mostrarCatalogo() throws Exception {
		
		String productos[] = new String[Catalogo.getnProductos()];
		
		for(int i=0; i < Catalogo.getnProductos(); i++) {
			productos[i] = Catalogo.readProducto(i).toString();
		}
		return productos; 
	}
		

}

