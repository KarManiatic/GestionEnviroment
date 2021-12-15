package dominio;

import java.util.ArrayList; 

public class GestorProductos {

	@SuppressWarnings("rawtypes")
	public static ArrayList mostrarInventario(String login, String password) throws Exception { //Meter en interfaz de constantes este valor
		Cliente cliente = Cliente.read(login, password);
		ArrayList productos = new ArrayList();
		int i = 0;
		while (i < 10) {
			if(cliente.leerProductoInventarioPersonal(i)!=null) {
			productos.add(cliente.leerProductoInventarioPersonal(i).toString());
			}
			i++;
		}
		return productos; 
	}
	
	@SuppressWarnings("rawtypes")
	public static ArrayList mostrarCatalogo() throws Exception { //Cambiar los 10, actualizando el numero de productos ¡NO PRIORITARIO!
		ArrayList productos = new ArrayList();
		int i = 0;
		while (i < 10) {
			if(Catalogo.readProducto(i) != null) {
			productos.add(Catalogo.readProducto(i).toString());
			}
		i++;
		}
		return productos; 
	}
		

}

