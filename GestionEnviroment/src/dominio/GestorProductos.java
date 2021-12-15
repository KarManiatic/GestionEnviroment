package dominio;

public class GestorProductos {

	public static String[] mostrarInventario(String login, String password) throws Exception {
		Cliente cliente = Cliente.read(login, password);
		String productos[] = new String[2];
		
		for(int i=0; i < 2; i++) {
			productos[i] = cliente.leerProductoInventarioPersonal(i).toString();
		}
		return productos; 
	}
	
	public static String[] mostrarCatalogo() throws Exception { //Cambiar los 10, actualizando el numero de productos ¡NO PRIORITARIO!
		
		String productos[] = new String[10];
		
		for(int i=0; i < 10; i++) {
			productos[i] = Catalogo.readProducto(i).toString();
		}
		return productos; 
	}
		

}

