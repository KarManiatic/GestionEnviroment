package dominio;

import java.util.Vector;

public class GestorProductos {

	//Esto lo dejo así(en void), porque no estoy seguro de cómo quieres sacarlo, pero vamos,  es cosa de poco
	public void mostrarInventario(Cliente cliente) throws Exception {
		
		for(int i=0; i < cliente.nProductosInventario(); i++) {
			cliente.leerProductoInventarioPersonal(i);
		}
		
	}
	
	public void mostrarCatalogo() {
		
		
	}
}
