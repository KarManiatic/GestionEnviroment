package dominio;

import persistencia.Agente;

import java.util.ArrayList;

public class Principal {

	public static void main(String [] args) throws Exception {
		
		boolean check = false;
		long tarjeta = 0123455;
		
		//check = GestorCompras.compraTarjeta(0, 0123455, "Vortegag", "12345");
		
		//GestorUsuario.nuevoCliente("Jime", "puto", "01234567", "C", "R", tarjeta);
		
		//check = GestorCompras.compraSaldo(00, "Jime", "puto");
		
		Cliente cliente = Cliente.read("Carlos", "1");
		System.out.println(cliente.leerProductoInventarioPersonal(2).toString());
		
		if(check)
		System.out.println("Perfe");
		
	
		ArrayList inventario = GestorProductos.mostrarInventario("Carlos","1");
		for(int i = 0; i < inventario.size(); i++)  
		   	System.out.println(inventario.get(i));
		   
		
		
		/*for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }*/
		
	}
	
	public static void insertar() throws Exception {
		Agente a = null;
		a = Agente.getAgente();
		
		a.insert("INSERT INTO `pruebabd`.`productos` (`nombre`, `id`, `precio`) VALUES ('prueba56', '23', '56');\r\n"+ "");
	}

}

 
